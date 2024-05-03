package com.ecom.dto.client;

import com.ecom.entity.SocialNetworkEntity;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SocialNetworkModel {
    List<SocialNetworkEntity> socialNetwork;;
}
