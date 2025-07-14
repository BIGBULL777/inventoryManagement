package com.InventoryManagement.inventory.dao;

import com.InventoryManagement.inventory.Entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends CrudRepository<Order, String> {
}
