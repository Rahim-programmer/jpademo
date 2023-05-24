package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Date;

@Entity
@Table(name = "COF_INVENTORY")
public class CoffeeInventory {

    @Id
    @Column(name = "WAREHOUSE_ID", nullable = false, updatable = false)
    @JsonProperty("warehouseID")
    private String id;

    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @Column(name = "COF_NAME")
    @JsonProperty("coffeeName")
    private String name;

    @NotBlank(message = "SupplierID is required")
    @Size(min = 2,max = 3,message = "SupplierID must be between 2 and 3 characters")
    @Column(name = "SUP_ID", insertable = false , updatable = false)
    @JsonProperty("supplierID")
    private long supplierID;

    @Size(min = 1,max = 2,message = "Quantity must be between 1 and 2 characters")
    @Column(name = "QUAN", nullable = false)
    @JsonProperty("QUANTITY")
    private int quan;

    @Column(name = "DATE_VAL", nullable = false)
    @JsonProperty("DATE_VALID")
    private Date Date_Valid;

    @ManyToOne
    @JoinColumn(
            name = "SUP_ID",
            insertable = true,
            updatable = true,
            foreignKey = @ForeignKey(
                    name = "SUP_ID",
                    foreignKeyDefinition = "FOREIGN KEY (SUP_ID)\n" +
                            "        REFERENCES SUPPLIERS (SUP_ID)"
            )
    )
    private Supplier supplier;

    public CoffeeInventory() {
    }

    public CoffeeInventory(String name, long supplierID, int quan, Date date_Valid, Supplier supplier) {
        this.name = name;
        this.supplierID = supplierID;
        this.quan = quan;
        Date_Valid = date_Valid;
        this.supplier = supplier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(long supplierID) {
        this.supplierID = supplierID;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public Date getDate_Valid() {
        return Date_Valid;
    }

    public void setDate_Valid(Date date_Valid) {
        Date_Valid = date_Valid;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Cof_Inventory{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", supplierID=" + supplierID +
                ", quan=" + quan +
                ", Date_Valid=" + Date_Valid +
                ", supplier=" + supplier +
                '}';
    }

}
