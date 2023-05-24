package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;

import java.math.BigDecimal;

@Entity
@Table(name = "COFFEES")
public class Coffees {
    @Id
    @Column(name = "COF_NAME", length = 32)
    @JsonProperty("coffeeName")
    private String cofName;
    @Column(name = "PRICE", precision = 10, scale = 2, nullable = false)
    @JsonProperty("coffeePrice")
    private BigDecimal price;

    @Digits(integer = 4,fraction = 0,message = "Sales must be between 1 and 4 characters")
    @Column(name = "SALES", nullable = false)
    @JsonProperty("coffeeSales")
    private Long sales;

    @Column(name = "TOTAL", nullable = false)
    @JsonProperty("coffeeTotal")
    private Long total;

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

    public Coffees() {
    }

    public String getCofName() {
        return cofName;
    }

    public void setCofName(String cofName) {
        this.cofName = cofName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Coffees{" +
                "cofName='" + cofName + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", total=" + total +
                ", supplier=" + supplier +
                '}';
    }
}
