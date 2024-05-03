package com.ecom.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioUserRequestDto {
    private String name;

    private String email;

    private String photoProfile;

    private String description;
}
