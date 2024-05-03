package com.ecom.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillRequestDto {
   Long competenceId;
   String addskillcategoryname;
   List<String> fields;

}
