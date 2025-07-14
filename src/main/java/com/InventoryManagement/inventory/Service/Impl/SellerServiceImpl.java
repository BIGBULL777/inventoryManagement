package com.InventoryManagement.inventory.Service.Impl;

import com.InventoryManagement.inventory.Dto.RegisterSellerRequestDto;
import com.InventoryManagement.inventory.Dto.RegisterSellerResponseDto;
import com.InventoryManagement.inventory.Service.SellerService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SellerServiceImpl implements SellerService {
    @Override
    public RegisterSellerResponseDto registerNewSeller(RegisterSellerRequestDto request) {
        try {
            log.info("SellerServiceImpl_registerNewSeller Registering new seller with mobile number {}", request.getSellerMobileNumber());
        } catch (Exception e) {
            log.error("SellerServiceImpl_registerNewSeller Error while registering new seller", e);
        }
        return null;
    }
}
