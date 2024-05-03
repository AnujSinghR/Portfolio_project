package com.ecom.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceCategoryId;
    @Column
    private Long experienceId;
    @Column
    private String categoryName;
    @Column
    private boolean isActive=true;
}
