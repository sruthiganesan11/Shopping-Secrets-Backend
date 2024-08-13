package com.example.dwellfi.dto;

import com.example.dwellfi.entities.CartItem;
import com.example.dwellfi.entities.User;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartDto {


    private Long id;

    private User user;

    private Set<CartItem> cartItems;
}
