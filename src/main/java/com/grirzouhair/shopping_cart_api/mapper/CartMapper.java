package com.grirzouhair.shopping_cart_api.mapper;

import com.grirzouhair.shopping_cart_api.dtos.CartDto;
import com.grirzouhair.shopping_cart_api.entities.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);
}
