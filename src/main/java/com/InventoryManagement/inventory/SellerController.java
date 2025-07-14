package com.InventoryManagement.inventory;

import com.InventoryManagement.inventory.Dto.RegisterSellerRequestDto;
import com.InventoryManagement.inventory.Dto.RegisterSellerResponseDto;
import com.InventoryManagement.inventory.Dto.ResponseDto;
import com.InventoryManagement.inventory.Service.SellerService;
import com.InventoryManagement.inventory.Util.ValidationUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController("seller")
@AllArgsConstructor
@Slf4j
public class SellerController {

    SellerService sellerService;

    @PostMapping(value = "/v1/register-new-seller", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto<RegisterSellerResponseDto>> registerSeller(@RequestBody RegisterSellerRequestDto request) {
        String errorMessage = ValidationUtil.validateSellerRequestDto(request);
        if (!Objects.isNull(errorMessage)) {
            RegisterSellerResponseDto res = new RegisterSellerResponseDto();
            res.setSellerId(null);
            res.setMessage(errorMessage);
            ResponseDto<RegisterSellerResponseDto> responseDto = new ResponseDto<>(errorMessage, res, errorMessage, false);
            return ResponseEntity.badRequest().body(responseDto);
        }
        log.info("Registering new seller with mobile number {}", request.sellerMobileNumber);
        RegisterSellerResponseDto res = sellerService.registerNewSeller(request);
        ResponseDto<RegisterSellerResponseDto> responseDto = new ResponseDto<>(res.getMessage(), res, null, true);
        return ResponseEntity.ok(responseDto);
    }
}
