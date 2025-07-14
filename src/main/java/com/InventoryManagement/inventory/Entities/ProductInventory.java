package com.InventoryManagement.inventory.Entities;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product_inventories")
@Data
@IdClass(ProductInventory.ProductInventoryId.class)
public class ProductInventory {

    @Id
    private Integer productId;

    @Id
    private String sellerId;

    @Column(nullable = false)
    private Integer quantity;


    @Override
    public String toString() {
        return "ProductInventory{" +
                "productId=" + productId +
                ", sellerId='" + sellerId + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    // --- Composite Primary Key Class ---
    public static class ProductInventoryId implements Serializable {
        private Integer productId;
        private String sellerId;

        public ProductInventoryId() {}

        public ProductInventoryId(Integer productId, String sellerId) {
            this.productId = productId;
            this.sellerId = sellerId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ProductInventoryId that = (ProductInventoryId) o;
            return Objects.equals(productId, that.productId) &&
                    Objects.equals(sellerId, that.sellerId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(productId, sellerId);
        }
    }
}