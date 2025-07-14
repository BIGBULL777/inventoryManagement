package com.InventoryManagement.inventory.dao;

import com.InventoryManagement.inventory.Entities.Seller;
import org.springframework.data.repository.CrudRepository;

public interface SellerDao extends CrudRepository<Seller, String> {
}
