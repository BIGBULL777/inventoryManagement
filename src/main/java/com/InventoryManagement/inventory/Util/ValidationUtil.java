package com.InventoryManagement.inventory.Util;

import com.InventoryManagement.inventory.Dto.RegisterSellerRequestDto;

public class ValidationUtil {

    public static String validateSellerRequestDto(RegisterSellerRequestDto request) {
        if (isNullOrEmpty(request.sellerMobileNumber)) {
            return "Invalid seller mobile number";
        }
        if (request.serviceablePincodes == null || request.serviceablePincodes.isEmpty()) {
            return "Please Enter Pincodes";
        }
        if (request.acceptedPaymentModes == null || request.acceptedPaymentModes.isEmpty()) {
            return "Please Enter payment modes";
        }

        return null;

    }

    public static boolean isNullOrEmpty(String str){
        return str == null || str.isEmpty();
    }

    public static boolean validateMobileNumber(String mobileNumber){
        return mobileNumber.matches("\\d{10}");
    }
}
