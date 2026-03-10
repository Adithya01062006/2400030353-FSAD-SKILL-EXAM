package com.klef.invoice.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.invoice.exam.model.Invoice;
import com.klef.invoice.exam.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/add")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return service.addInvoice(invoice);
    }

    @GetMapping("/view")
    public List<Invoice> viewInvoices() {
        return service.getAllInvoices();
    }
}