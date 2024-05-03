package com.ecom.dto.client;

import com.ecom.entity.SkillEntity;
import lombok.*;

import javax.persistence.Column;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SkillCategoryModel {
    private Long skillCategoryId;
    private String skillCategory;
    private Long competenceId;
    private List<SkillEntity> skillEntityList;
    private boolean isActive=true;
}
