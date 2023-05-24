package com.example.demo.controller.api;


import com.example.demo.entity.Supplier;
import com.example.demo.model.SupplierDTO;
import com.example.demo.service.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    private final SupplierService service;

    public SupplierController(SupplierService supplierRepository) {
        this.service = supplierRepository;
    }

    @PostMapping
    public ResponseEntity<Supplier> saveSupplier(
            @RequestBody SupplierDTO supplier) {
        System.out.println(supplier);
        Supplier _supplier = service.save(supplier);
        return new ResponseEntity<>(_supplier, HttpStatus.CREATED);
    }


}
