package com.match.UserManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "education_and_qualifications")
public class EducationAndQualifications {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currentJob;
    private String currentCtc;
    private String currentJobLocation;

    private String highestQualification;
    private String specialization;

}
