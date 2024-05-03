package com.ecom.dto.client;


import lombok.*;

import javax.persistence.Column;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CompetecesModel {
    private Long competenceId;
    private Long portfolioUserId;
    private String name;
    private String description;
    private List<SkillCategoryModel> skillCategory;
    private boolean isActive=true;
}
