package com.ecom.dto;

import com.ecom.dto.model.AboutmeNavObj;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AboutMeNarRequestDto {
    Long portfolioId;
    Long aboutMeId;
    String aboutmedesc;
    String aboutmefileurl;
    List<AboutmeNavObj> aboutmeNav;
}
