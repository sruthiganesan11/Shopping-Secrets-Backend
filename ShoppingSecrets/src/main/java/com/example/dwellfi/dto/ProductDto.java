package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Category;
import com.example.dwellfi.entities.Review;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private long id;

    private String name;

    private String description;

    private Double price;

    private String imageUrl;

    private Category category;

    private Set<Review> reviews;
}
