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
public class SkillEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String skillname;
    @Column
    private Long skillCategoryId;
    @Column
    private String description;
    @Column
    private Long skillRate;
    @Column
    private boolean isActive=true;
}
