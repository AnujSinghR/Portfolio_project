package com.ecom.service;

import com.ecom.entity.SocialNetworkEntity;
import com.ecom.repository.SocialNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkServiceImpl implements SocialNetworkService{
    @Autowired
    private SocialNetworkRepository socialNetworkRepository;
    @Override
    public List<SocialNetworkEntity> findByportfolioid(Long portfolioId) {
        return socialNetworkRepository.findByPortfolioId(portfolioId);
    }

    @Override
    public SocialNetworkEntity addSocialNetwork(SocialNetworkEntity socialNetworkEntity) {
        return socialNetworkRepository.save(socialNetworkEntity);
    }
}
