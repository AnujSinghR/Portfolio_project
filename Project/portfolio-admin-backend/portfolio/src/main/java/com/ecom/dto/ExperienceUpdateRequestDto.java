package com.ecom.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Data
public class ExperienceUpdateRequestDto {
    private Long portfolioId;
    private Long experienceId;
    private Long experiencecategoryId;
    private Long updateexperiendetailsId;
    private String updatecategoryName;
    private String updateexperienceDetailname;
    private String updateexperiencedescription;
    private String img;
}
