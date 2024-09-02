package com.match.UserManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String gender;
    @NonNull
    private String email;
    @NonNull
    private String contact;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private Images images;

    // One to many mapping with EducationAndQualifications
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id" , referencedColumnName = "user_id")
    private List<EducationAndQualifications> educationAndQualifications;
}
