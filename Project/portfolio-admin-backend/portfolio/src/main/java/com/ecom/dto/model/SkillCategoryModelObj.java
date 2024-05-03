package com.ecom.dto.model;

import com.ecom.entity.SkillEntity;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SkillCategoryModelObj {
    private Long skillCategoryId;
    private String skillCategory;
    private List<SkillEntity> skillModelObjectList;
}
