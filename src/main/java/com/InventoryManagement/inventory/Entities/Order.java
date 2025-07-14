package com.InventoryManagement.inventory.Entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    private String orderId;

    @Column(name = "destination_pincode", nullable = false)
    private String destinationPincode;

    @Column(name = "seller_id", nullable = false)
    private String sellerId;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "product_count", nullable = false)
    private Integer productCount;

    @Column(name = "payment_mode", nullable = false)
    private String paymentMode;

    @Column(nullable = false)
    private String status;

    // Default constructor for JPA
    public Order() {
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", destinationPincode='" + destinationPincode + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", productId=" + productId +
                ", productCount=" + productCount +
                ", paymentMode='" + paymentMode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
