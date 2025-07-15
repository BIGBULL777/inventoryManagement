package com.InventoryManagement.inventory.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSellerResponse {
    public String sellerName;
    public String sellerMobileNumber;
    public List<String> servicablePincodes;
    public List<String> paymentModesAccepted;
}