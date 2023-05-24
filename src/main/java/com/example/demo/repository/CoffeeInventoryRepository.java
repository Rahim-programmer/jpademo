package com.example.demo.repository;

import com.example.demo.entity.CoffeeInventory;
import com.example.demo.entity.Coffees;
import com.example.demo.entity.Supplier;
import com.example.demo.model.CoffeeInventoryDTO;
import com.example.demo.service.CoffeeInventoryService;
import com.example.demo.service.CoffeeInventoryServiceJPA;
import com.example.demo.service.CoffeesServiceJPA;
import com.example.demo.service.SupplierServiceJPA;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoffeeInventoryRepository implements CoffeeInventoryService {
    private final CoffeeInventoryServiceJPA serviceJPA;

    private final SupplierServiceJPA supplierServiceJPA;
    private final CoffeesServiceJPA coffeesServiceJPA;


    public CoffeeInventoryRepository(CoffeeInventoryServiceJPA serviceJPA, SupplierServiceJPA supplierServiceJPA, CoffeesServiceJPA coffeesServiceJPA) {
        this.serviceJPA = serviceJPA;
        this.supplierServiceJPA = supplierServiceJPA;
        this.coffeesServiceJPA = coffeesServiceJPA;
    }

    @Override
    public CoffeeInventory save(CoffeeInventoryDTO cofInventory) {
        CoffeeInventory cofInventory1 = new CoffeeInventory();
        Optional<Supplier> supplier = supplierServiceJPA.findById(cofInventory.supplierID());
        Optional<Coffees> coffees = coffeesServiceJPA.findByName(cofInventory.coffeeName());
        cofInventory1.setName(cofInventory.name());
        cofInventory1.setSupplierID(cofInventory.supplierID());
        cofInventory1.setQuan(cofInventory.quan());
        CoffeeInventory saveCofInventory = serviceJPA.save(cofInventory1);
        return saveCofInventory;
    }
}
