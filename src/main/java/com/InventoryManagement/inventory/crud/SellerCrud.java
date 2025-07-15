package com.InventoryManagement.inventory.crud;

import com.InventoryManagement.inventory.Dto.RegisterSellerRequestDto;
import com.InventoryManagement.inventory.Dto.RegisterSellerResponseDto;
import com.InventoryManagement.inventory.Entities.Seller;
import com.InventoryManagement.inventory.dao.SellerDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class SellerCrud {

    SellerDao sellerDao;

    public String registerNewSeller(RegisterSellerRequestDto request) {
        Seller seller = new Seller();
        seller.setSellerId(UUID.randomUUID().toString());
        seller.setServiceablePincodesJson(request.getServiceablePincodes().toString());
        seller.setPaymentModesJson(request.getAcceptedPaymentModes().toString());
        seller.setSellerName(request.getSellerName());
        sellerDao.save(seller);
        return seller.getSellerId();
    }

    public Seller findBySellerName(String sellerName) {
         return sellerDao.findBySellerName(sellerName);
    }
}
