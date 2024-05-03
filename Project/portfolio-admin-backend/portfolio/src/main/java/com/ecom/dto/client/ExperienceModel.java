package com.ecom.dto.client;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ExperienceModel {
    private Long experienceId;
    private Long portfolioId;
    private String name;
    private boolean enable;
    List<ExperienceCategoryModel> experienceCategoryModelList;
}
