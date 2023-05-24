package com.example.demo.service;


import com.example.demo.entity.CoffeeInventory;
import com.example.demo.model.CoffeeInventoryDTO;


public interface CoffeeInventoryService {
    CoffeeInventory save(CoffeeInventoryDTO cofInventory);
}
