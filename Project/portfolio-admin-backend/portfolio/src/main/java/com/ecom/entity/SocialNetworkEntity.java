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
public class SocialNetworkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long portfolioId;
    private String name;
    private String url;
    @Column
    private boolean isActive=true;
}
