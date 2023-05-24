package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "SUPPLIERS")
public class Supplier {
    @Id
    @Column(name = "SUP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("supplierID")
    private Long supID;
    @JsonProperty("supplierName")
    @Column(name = "SUP_NAME", nullable = false)
    private String supName;

    @Column(name = "STREET", nullable = false)
    @JsonProperty("supplierStreet")
    private String street;

    @Column(name = "CITY", nullable = false)
    @JsonProperty("supplierCity")
    private String city;

    @Column(name = "STATE", length = 2, nullable = false)
    @JsonProperty("supplierState")
    private String state;
    @Column(name = "ZIP", length = 5, nullable = false)
    @JsonProperty("supplierZip")
    private String zip;

    protected Supplier() {
    }

    public Supplier(Long supID, String supName, String street, String city, String state, String zip) {
        this.supID = supID;
        this.supName = supName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Long getSupID() {
        return supID;
    }

    public void setSupID(Long supID) {
        this.supID = supID;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supID=" + supID +
                ", supName='" + supName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
