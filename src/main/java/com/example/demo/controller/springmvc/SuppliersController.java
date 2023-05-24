package com.example.demo.controller.springmvc;

import com.example.demo.entity.Supplier;
import com.example.demo.model.SupplierDTO;
import com.example.demo.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/suppliers")
public class SuppliersController {

    @GetMapping
    public String showSupplierForm(SupplierDTO supplier) {
        return "suppliers";
    }

}
