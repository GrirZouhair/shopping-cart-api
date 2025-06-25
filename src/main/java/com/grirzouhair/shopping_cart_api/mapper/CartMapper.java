package com.grirzouhair.shopping_cart_api.mapper;

import com.grirzouhair.shopping_cart_api.dtos.CartDto;
import com.grirzouhair.shopping_cart_api.dtos.CartItemDto;
import com.grirzouhair.shopping_cart_api.entities.Cart;
import com.grirzouhair.shopping_cart_api.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPriceAll())")
    CartDto toDto(Cart cart);
    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
