package com.klef.invoice.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.invoice.exam.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}