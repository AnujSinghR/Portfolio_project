package com.ecom.dto.client;


import com.ecom.entity.AboutMeNavEntity;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AboutMeModel {
    private Long aboutMeId;
    private Long portfolioUserId;
    private String photoFilePath;
    private String description;
    List<AboutMeNavEntity> aboutMeNav;
    private boolean isActive;
}
