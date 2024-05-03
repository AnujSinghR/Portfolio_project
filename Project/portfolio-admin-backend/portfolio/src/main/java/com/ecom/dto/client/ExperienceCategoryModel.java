package com.ecom.dto.client;

import com.ecom.entity.ExperienceDetailsEntity;
import lombok.*;

import javax.persistence.Column;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ExperienceCategoryModel {
    private Long experienceCategoryId;
    private Long experienceId;
    private String categoryName;
    List<ExperienceDetailsEntity> experienceDetailsEntities;
    private boolean isActive=true;
}
