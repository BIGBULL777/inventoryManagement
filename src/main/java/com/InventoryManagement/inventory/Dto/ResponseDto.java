package com.InventoryManagement.inventory.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    public String message;
    public Object data;
    public String errorMessage;
    public boolean success;


}
