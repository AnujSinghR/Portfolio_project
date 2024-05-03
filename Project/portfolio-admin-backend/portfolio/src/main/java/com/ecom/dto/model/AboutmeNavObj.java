package com.ecom.dto.model;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AboutmeNavObj {
    Long aboutmeNavId;
    List<String> description;
    List<String> isActive;
}
