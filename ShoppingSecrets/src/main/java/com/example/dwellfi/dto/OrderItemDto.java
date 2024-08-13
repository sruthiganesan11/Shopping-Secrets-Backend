package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Order;
import com.example.dwellfi.entities.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {

    private Long id;

    private Order order;

    private Product product;

    private Integer quantity;

    private Double price;
}
