package com.ecom.service;

import com.ecom.entity.SocialNetworkEntity;

import java.util.List;

public interface SocialNetworkService {
    List<SocialNetworkEntity> findByportfolioid(Long portfolioId);
    SocialNetworkEntity addSocialNetwork(SocialNetworkEntity socialNetworkEntity);

}
