package com.InventoryManagement.inventory.DataMapper;

import com.InventoryManagement.inventory.CustomExceptions.InventoryManagementSystemException;
import com.InventoryManagement.inventory.Dto.GetSellerResponse;
import com.InventoryManagement.inventory.Entities.Seller;

import java.util.Arrays;
import java.util.List;

public class DataMapper {
    public static  List<String> mapStringToList(String ListString) {
        try {
            return Arrays.asList(ListString.split(","));
        } catch (Exception e) {
            throw new InventoryManagementSystemException(e.toString());
        }

    }
}
