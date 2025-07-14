package com.InventoryManagement.inventory.Dto;

import java.util.List;

public class RegisterSellerRequestDto {
    public String sellerMobileNumber;
    public List<String> serviceablePincodes;
    public List<String> acceptedPaymentModes;
}
