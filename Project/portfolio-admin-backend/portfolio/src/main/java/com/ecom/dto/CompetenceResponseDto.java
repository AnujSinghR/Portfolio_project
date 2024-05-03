package com.ecom.dto;

import com.ecom.dto.model.SkillCategoryModelObj;
import com.ecom.entity.CompetencesEntity;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Data
public class CompetenceResponseDto {

    private CompetencesEntity competencesEntity;
    private List<SkillCategoryModelObj> skillCategoryModelObjList;
}
