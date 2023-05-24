package com.example.demo.service;

import com.example.demo.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierServiceJPA extends JpaRepository<Supplier, Long> {
}
