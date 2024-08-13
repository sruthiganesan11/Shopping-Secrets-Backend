package com.example.dwellfi.dto;

import com.example.dwellfi.entities.Order;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private Long id;

    private Order order;

    private String paymentMethod;

    private LocalDate paymentDate;

    private Double amount;
}
