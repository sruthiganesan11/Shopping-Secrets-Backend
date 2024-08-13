package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Product;
import com.example.dwellfi.entities.User;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {

    private Long id;

    private Product product;

    private User user;

    private Integer rating;

    private String comment;
}
