package com.match.UserManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Images")
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long imageId;

    @OneToOne(mappedBy = "images")
    private User user;

    private String profilePictureUrl;

    private String img1;
    private String img2;
    private String img3;
    private String img4;

}
