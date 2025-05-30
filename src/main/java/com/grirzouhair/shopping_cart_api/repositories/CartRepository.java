package com.grirzouhair.shopping_cart_api.repositories;

import com.grirzouhair.shopping_cart_api.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
}
