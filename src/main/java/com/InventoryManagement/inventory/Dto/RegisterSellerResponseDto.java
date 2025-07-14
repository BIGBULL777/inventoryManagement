package com.InventoryManagement.inventory.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterSellerResponseDto {
    public String message;
    public String sellerId;
}
