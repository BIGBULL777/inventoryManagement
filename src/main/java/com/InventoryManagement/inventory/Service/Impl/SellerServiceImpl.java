package com.InventoryManagement.inventory.Service.Impl;

import com.InventoryManagement.inventory.Dto.RegisterSellerRequestDto;
import com.InventoryManagement.inventory.Dto.RegisterSellerResponseDto;
import com.InventoryManagement.inventory.Service.SellerService;
import com.InventoryManagement.inventory.crud.SellerCrud;
import lombok.extern.slf4j.Slf4j;

import static com.InventoryManagement.inventory.Constants.ErrorConstants.SOMETHING_WENT_WRONG;

@Slf4j
public class SellerServiceImpl implements SellerService {
    SellerCrud sellerCrud;

    @Override
    public RegisterSellerResponseDto registerNewSeller(RegisterSellerRequestDto request) {
        try {
            log.info("SellerServiceImpl_registerNewSeller Registering new seller with mobile number {}", request.getSellerMobileNumber());
            String generatedSellerId = sellerCrud.registerNewSeller(request);
            return new RegisterSellerResponseDto(null, generatedSellerId);
        } catch (Exception e) {
            log.error("SellerServiceImpl_registerNewSeller Error while registering new seller", e);
            return new RegisterSellerResponseDto(SOMETHING_WENT_WRONG, null);
        }
    }
}
