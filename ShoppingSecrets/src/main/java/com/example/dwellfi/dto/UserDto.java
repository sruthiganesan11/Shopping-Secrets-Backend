package com.example.dwellfi.dto;

import com.example.dwellfi.entities.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String contact;

    private List<Address> addresses = new ArrayList<>();

    private Set<Wishlist> wishlists;

    private ShoppingCart shoppingCart;

    private Set<Order> orders;

    private List<Payment> paymentList = new ArrayList<>();

    private List<Review> reviews = new ArrayList<>();
}
