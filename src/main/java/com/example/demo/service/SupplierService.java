package com.example.demo.service;

import com.example.demo.entity.Supplier;
import com.example.demo.model.SupplierDTO;

public interface SupplierService {
    Supplier save(SupplierDTO supplier);
}
