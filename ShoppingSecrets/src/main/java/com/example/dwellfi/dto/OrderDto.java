package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Address;
import com.example.dwellfi.entities.OrderItem;
import com.example.dwellfi.entities.Payment;
import com.example.dwellfi.entities.User;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Long id;

    private User user;

    private Set<OrderItem> orderItems;

    private Address shippingAddress;

    private Payment payment;

    private LocalDate orderDate;

    private Double totalAmount;

    private String status;
}
