package com.ecom.dto;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateAndSaveResponseDto {
    HttpStatus httpStatus;
    String description;
}
