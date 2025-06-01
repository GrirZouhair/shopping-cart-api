package com.grirzouhair.shopping_cart_api.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
@Data
public class UpdateCartItemRequest {
    @NotNull(message = "Quantity must be provided.")
    @Min(value = 1, message = "Quantity must be greater than zero.")
    @Max(value = 1000, message = "Quantity must be less than or equal to 100.")
    private Integer quantity;
}
