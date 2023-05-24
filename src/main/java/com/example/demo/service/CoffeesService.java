package com.example.demo.service;

import com.example.demo.entity.Coffees;
import com.example.demo.model.CoffeeDTO;

public interface CoffeesService {

    Coffees save(CoffeeDTO coffee);
}
