package com.jdc.flux.products.model.service;

import com.jdc.flux.products.model.entity.Details;
import com.jdc.flux.products.model.entity.Invoice;
import com.jdc.flux.products.model.repo.DetailsRepo;
import com.jdc.flux.products.model.repo.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepo invoiceRepo;
    @Autowired
    private DetailsRepo detailsRepo;

    public Flux<Invoice> search(String customer, LocalDate from, LocalDate to) {
        return null;
    }

    @Transactional
    public Mono<Invoice> save(Invoice invoice) {
        return invoiceRepo.save(invoice);
    }

    @Transactional
    public Mono<Invoice> save(int id, Invoice invoice) {
        return invoiceRepo.findById(id).flatMap(a -> invoiceRepo.save(Invoice.of(a.id(), invoice)));
    }

    public Mono<Invoice> findById(int id) {
        return invoiceRepo.findById(id);
    }

    public Flux<Details> findDetails(int id) {
        return detailsRepo.findByBalanceId(id);
    }

    @Transactional
    public Flux<Details> createDetails(int id, List<Details> list) {
        return invoiceRepo.findById(id).flatMapMany(a -> detailsRepo.saveAll(Details.withInvoice(a.id(), list)));
    }

    /**
     * Update Method Use Delete Insert Policy
     * @param id Invoice ID
     * @param list  Details List
     * @return  Updated Details List
     */
    @Transactional
    public Flux<Details> updateDetails(int id, List<Details> list) {
        return invoiceRepo.findById(id)
                .flatMap(a -> detailsRepo.deleteByInvoiceId(a.id()))
                .flatMapMany(a -> detailsRepo.saveAll(Details.withInvoice(id, list)));
    }
}
