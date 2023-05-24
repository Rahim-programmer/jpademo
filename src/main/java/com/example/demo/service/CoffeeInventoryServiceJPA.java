package com.example.demo.service;

import com.example.demo.entity.CoffeeInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeInventoryServiceJPA extends JpaRepository<CoffeeInventory, Integer> {
}
