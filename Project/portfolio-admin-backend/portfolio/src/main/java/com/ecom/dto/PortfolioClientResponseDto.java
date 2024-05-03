package com.ecom.dto;

import com.ecom.dto.client.*;
import com.ecom.entity.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@JsonSerialize
public class PortfolioClientResponseDto {
    PortfolioUserEntity portfolio;
    AboutMeModel aboutUs;
    CompetecesModel competeces;
    EducationModel education;
    ExperienceModel experience;
    SocialNetworkModel socialNetwork;
}
