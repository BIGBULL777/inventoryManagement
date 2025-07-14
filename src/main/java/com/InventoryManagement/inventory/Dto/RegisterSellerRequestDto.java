package com.InventoryManagement.inventory.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterSellerRequestDto {
    public String sellerMobileNumber;
    public List<String> serviceablePincodes;
    public List<String> acceptedPaymentModes;
}
