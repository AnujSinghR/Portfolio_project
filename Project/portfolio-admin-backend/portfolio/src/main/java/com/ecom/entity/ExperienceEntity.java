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
public class ExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceId;
    @Column
    private Long portfolioId;
    @Column
    private String name;
    @Column
    private boolean isActive=true;


}
