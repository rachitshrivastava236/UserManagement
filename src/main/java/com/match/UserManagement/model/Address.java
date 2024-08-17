package com.match.UserManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addresId;

    @NonNull
    private String line1;
    private String line2;
    private String line3;
    private String landmark;
    @NonNull
    private String city;
    @NonNull
    private String state;
    @NonNull
    private String country;
    @NonNull
    private int pincode;

    @OneToOne(mappedBy = "address")
    private User user;
}
