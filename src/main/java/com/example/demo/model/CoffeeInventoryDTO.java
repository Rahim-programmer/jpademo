package com.example.demo.model;

import javax.xml.crypto.Data;

public record CoffeeInventoryDTO(String name,
                                 Long supplierID,
                                 int quan,
                                 Data Date_Valid,
                                 String coffeeName){
}
