package com.example.demo.controller.api;

import com.example.demo.entity.Coffees;
import com.example.demo.model.CoffeeDTO;
import com.example.demo.service.CoffeesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coffees")
public class CoffeesController {

    private final CoffeesService service;

    public CoffeesController(CoffeesService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Coffees> saveSupplier(
            @RequestBody CoffeeDTO coffee) {
        Coffees _coffees = service.save(coffee);
        return new ResponseEntity<>(_coffees, HttpStatus.CREATED);
    }
}
