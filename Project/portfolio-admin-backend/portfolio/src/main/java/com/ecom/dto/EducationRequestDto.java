package com.ecom.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Data
public class EducationRequestDto {
    private Long portPofolioId;
    private Long educationId;
    private Long educationDetailId;
    private String educationname;
    private String educationdescription;
    private Integer startyear;
    private Integer endyear;
    private Boolean detectchange;
}
