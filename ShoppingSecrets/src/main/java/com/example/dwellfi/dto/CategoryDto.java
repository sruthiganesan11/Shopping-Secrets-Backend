package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Product;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Long id;

    private String name;

    private String description;

    private Set<Product> products;
}
