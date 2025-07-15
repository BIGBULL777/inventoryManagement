package com.InventoryManagement.inventory.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sellers")
@Data
public class Seller {

    @Id
    private String sellerId;

    @Column(name = "serviceable_pincodes", nullable = false)
    private String serviceablePincodesJson;

    // Stores Set<String> as a comma-separated string.
    @Column(name = "payment_modes", nullable = false)
    private String paymentModesJson;

    @Column(name =  "seller_name", nullable = false ,unique = true)
    private String sellerName;


    @Override
    public String toString() {
        return "Seller{" +
                "sellerId='" + sellerId + '\'' +
                ", serviceablePincodesJson='" + serviceablePincodesJson + '\'' +
                ", paymentModesJson='" + paymentModesJson + '\'' +
                '}';
    }
}
