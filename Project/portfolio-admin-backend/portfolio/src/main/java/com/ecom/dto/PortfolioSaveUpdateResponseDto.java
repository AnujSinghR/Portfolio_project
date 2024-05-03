package com.ecom.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioSaveUpdateResponseDto {
    private String status;
    private String message;
}
