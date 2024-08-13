package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Product;
import com.example.dwellfi.entities.User;

import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDto {

    private Long id;

    private User user;

    private Set<Product> products;
}
