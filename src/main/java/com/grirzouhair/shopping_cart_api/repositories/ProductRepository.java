package com.grirzouhair.shopping_cart_api.repositories;

import com.grirzouhair.shopping_cart_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
