package com.ecom.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioUserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long userId;
    @Column
    private String name;
    @Column
    private String email;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String photoProfile;
    @Column
    private String description;
    @Column
    private boolean isActive=true;
}
