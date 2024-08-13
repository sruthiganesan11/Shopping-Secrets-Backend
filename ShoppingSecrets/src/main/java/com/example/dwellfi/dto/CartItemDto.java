package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Product;
import com.example.dwellfi.entities.ShoppingCart;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
    private Long id;

    private ShoppingCart shoppingCart;

    private Product product;

    private Integer quantity;
}
