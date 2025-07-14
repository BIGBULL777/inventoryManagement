package com.InventoryManagement.inventory.dao;

import com.InventoryManagement.inventory.Entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderDao extends CrudRepository<Order, String> {
}
