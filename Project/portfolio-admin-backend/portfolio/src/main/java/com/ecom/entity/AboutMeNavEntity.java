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
public class AboutMeNavEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long aboutMeId;
    @Column
    private String aboutMeName;
    @Column
    private String imgaeUrl;
    @Column(length = 4000)
    private String description;
    @Column
    private boolean isActive=true;
}
