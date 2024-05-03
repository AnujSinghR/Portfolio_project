package com.ecom.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@JsonSerialize
public class PortfolioClientRequestDto {
    private String email;
}
