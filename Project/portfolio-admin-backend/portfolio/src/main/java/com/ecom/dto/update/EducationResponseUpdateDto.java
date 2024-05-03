package com.ecom.dto.update;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EducationResponseUpdateDto {

    HttpStatus httpStatus;
    String description;
}


