package com.ecom.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AboutMeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aboutMeId;
    @Column
    private Long portfolioUserId;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String photoFilePath;
    @Column
    private String description;
    @Column
    private boolean isActive=true;


}
