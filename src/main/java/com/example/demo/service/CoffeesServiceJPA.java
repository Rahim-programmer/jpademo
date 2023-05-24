package com.example.demo.service;

import com.example.demo.entity.Coffees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoffeesServiceJPA extends JpaRepository<Coffees, String> {
    Optional<Coffees> findByName(String name);
}
