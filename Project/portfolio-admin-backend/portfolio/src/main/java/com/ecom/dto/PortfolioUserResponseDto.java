package com.ecom.dto;

import com.ecom.entity.PortfolioUserEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioUserResponseDto {

    PortfolioUserEntity portfolioUserEntity;
}
