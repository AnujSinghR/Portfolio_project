package com.ecom.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkillCategoryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillCategoryId;
    @Column
    private String skillCategory;

    @Column
    private Long competenceId;

    @OneToMany( targetEntity=SkillEntity.class )
    private List skillList;
    @Column
    private boolean isActive=true;
}
