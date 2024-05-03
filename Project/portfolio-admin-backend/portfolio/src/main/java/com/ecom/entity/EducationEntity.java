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
public class EducationEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;
    @Column
    private Long portPofolioId;
    @Column
    private String name;
    @Column
    private String educationDescription;
    @Column
    private boolean enable=true;

    @OneToMany(targetEntity = EducationDetailEntity.class)
    private List educationdetailList;

    @Column
    private boolean isActive=true;
}
