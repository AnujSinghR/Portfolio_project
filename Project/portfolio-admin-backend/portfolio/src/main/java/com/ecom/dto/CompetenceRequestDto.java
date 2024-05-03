package com.ecom.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Data
public class CompetenceRequestDto {
    private Long competenceId;
    private Long portfolioId;
    private Long skillCategoryId;
    private Long skillId;
    private Long skillrate;
    private String skillcategoryname;
    private String skillname;

}
