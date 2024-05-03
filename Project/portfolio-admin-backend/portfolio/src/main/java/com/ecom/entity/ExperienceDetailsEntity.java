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
public class ExperienceDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceDetailId;
    @Column
    private Long experienceCategoryId;
    @Column
    private String name;
    @Column
    private String experiencedescription;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String img;
    @Column
    private boolean isActive=true;
}
