package com.example.demo.repository;

import com.example.demo.entity.Coffees;
import com.example.demo.entity.Supplier;
import com.example.demo.model.CoffeeDTO;
import com.example.demo.service.CoffeesService;
import com.example.demo.service.CoffeesServiceJPA;
import com.example.demo.service.SupplierServiceJPA;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class CoffeesRepository implements CoffeesService {

    private final CoffeesServiceJPA service;
    private final SupplierServiceJPA serviceService;

    public CoffeesRepository(CoffeesServiceJPA service, SupplierServiceJPA serviceService) {
        this.service = service;
        this.serviceService = serviceService;
    }

    @Override
    public Coffees save(CoffeeDTO coffee) {
        System.out.println("I am CoffeesRepository object.");
        Long idSupplier = Long.parseLong(coffee.supplierID());
        Optional<Supplier> byIdSupplier = serviceService.findById(idSupplier);
        if (!byIdSupplier.isEmpty()) {
            Supplier supplier = byIdSupplier.get();
            System.out.println(supplier);

            Coffees coffees = new Coffees();
            coffees.setCofName(coffee.coffeeName());
            coffees.setSupplier(supplier);
            coffees.setPrice(new BigDecimal(coffee.coffeePrice()));
            coffees.setSales(Long.parseLong(coffee.coffeeSales()));
            coffees.setTotal(Long.parseLong(coffee.coffeeTotal()));

            Coffees savedCoffees = service.save(coffees);


            return savedCoffees;
        }
        return null;
    }
}
