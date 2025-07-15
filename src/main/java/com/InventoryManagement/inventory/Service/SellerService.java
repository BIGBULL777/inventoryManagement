package com.InventoryManagement.inventory.Service;

import com.InventoryManagement.inventory.Dto.GetSellerResponse;
import com.InventoryManagement.inventory.Dto.RegisterSellerRequestDto;
import com.InventoryManagement.inventory.Dto.RegisterSellerResponseDto;
import org.springframework.stereotype.Component;

@Component
public interface SellerService {
    RegisterSellerResponseDto registerNewSeller(RegisterSellerRequestDto request);

    GetSellerResponse getSellerDetails(String sellerName);
}
