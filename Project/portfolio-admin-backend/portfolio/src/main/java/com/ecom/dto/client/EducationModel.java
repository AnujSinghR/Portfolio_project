package com.ecom.dto.client;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class EducationModel {
    private Long educationId;
    private Long portPofolioId;
    private String name;
    private String educationDescription;
    private boolean enable=true;
    private List<EducationDetailModel> educationDetailModelList;
}
