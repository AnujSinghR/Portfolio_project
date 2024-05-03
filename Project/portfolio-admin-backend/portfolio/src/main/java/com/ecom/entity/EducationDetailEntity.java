package com.ecom.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EducationDetailEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationDetailId;
    @Column
    private Long educationId;
    @Column
    private String name;
    @Column(length = 5000)
    private String educationalDescription;
    @Column
    private int startYear;
    @Column
    private int endYear;
    @Column
    private boolean isActive=true;
}
