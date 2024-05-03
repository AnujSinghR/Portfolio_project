package com.ecom.dto;

import com.ecom.entity.EducationDetailEntity;
import com.ecom.entity.EducationEntity;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Data
public class EducationResponseDto {
    EducationEntity educationEntity;
    List<EducationDetailEntity> educationDetailEntityList;

}
