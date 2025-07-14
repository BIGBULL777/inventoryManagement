package com.InventoryManagement.inventory.dao;

import com.InventoryManagement.inventory.Entities.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerDao extends CrudRepository<Seller, String> {
}
