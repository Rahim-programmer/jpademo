package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SupplierDTO(@NotNull String supplierName,
                          @NotNull String supplierStreet,
                          @NotNull String supplierCity,
                          @NotNull String supplierState,
                          @NotNull
                          @NotBlank
                          String supplierZip) {

}
