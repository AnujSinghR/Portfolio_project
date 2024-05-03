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
public class UploadFileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long portfolioId;

    private String filePath;

    private String fileName;


}
