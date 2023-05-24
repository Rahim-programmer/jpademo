package com.example.demo.controller.api;

import com.example.demo.entity.CoffeeInventory;
import com.example.demo.model.CoffeeInventoryDTO;
import com.example.demo.service.CoffeeInventoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coffees_inventory")
public class CoffeeInventoryController {

    private final CoffeeInventoryService service;

    public CoffeeInventoryController(CoffeeInventoryService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CoffeeInventory> saveCof_inventory(
           @Valid @RequestBody CoffeeInventoryDTO cofInventory) {
        CoffeeInventory cofInventory1 = service.save(cofInventory);
        return new ResponseEntity<>(cofInventory1, HttpStatus.CREATED);
    }
}
