package com.ecom.dto.client;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class EducationDetailModel {
    private Long educationDetailId;
    private Long educationId;
    private String name;
    private String educationalDescription;
    private int startYear;
    private int endYear;
}
