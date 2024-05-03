package com.ecom.dto;

import com.ecom.entity.AboutMeEntity;
import com.ecom.entity.AboutMeNavEntity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.Column;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@JsonSerialize
public class PortfolioAboutMeResponseDto {

    AboutMeEntity aboutMeEntity;
    List<AboutMeNavEntity> aboutMeNavEntity;
}
