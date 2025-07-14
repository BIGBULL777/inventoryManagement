package com.InventoryManagement.inventory.dao;

import com.InventoryManagement.inventory.Entities.ProductInventory;
import org.springframework.data.repository.CrudRepository;

public interface ProductInventoryDao extends CrudRepository<ProductInventory, ProductInventory.ProductInventoryId> {
}
