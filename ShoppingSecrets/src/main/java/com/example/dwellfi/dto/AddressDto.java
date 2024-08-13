package com.example.dwellfi.dto;

import com.example.dwellfi.entities.User;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AddressDto {

    private long id;

    private User user;

    private String street;

    private String city;

    private String state;

    private String country;

    private long postalCode;

    private String contact;
}
