package com.example.demo.repository;

import com.example.demo.entity.Supplier;
import com.example.demo.model.SupplierDTO;
import com.example.demo.service.SupplierService;
import com.example.demo.service.SupplierServiceJPA;
import org.springframework.stereotype.Service;

@Service
public class SupplierRepository implements SupplierService {

    private final SupplierServiceJPA service;

    public SupplierRepository(SupplierServiceJPA service) {
        this.service = service;
    }

    @Override
    public Supplier save(SupplierDTO supplier) {
        Supplier entity = new Supplier(
                101L,
                supplier.supplierName(),
                supplier.supplierStreet(),
                supplier.supplierCity(),
                supplier.supplierState(),
                supplier.supplierZip()
        );
        return service.save(entity);
    }

}
