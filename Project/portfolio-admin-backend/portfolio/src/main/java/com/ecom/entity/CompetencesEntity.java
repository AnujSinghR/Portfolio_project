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
public class CompetencesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long competenceId;
    @Column
    private Long portfolioUserId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private boolean isActive=true;
}
