package com.ecom.service;

import com.ecom.entity.PortfolioUserEntity;
import com.ecom.repository.PortfolioUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioUserServiceImpl implements PortfolioUserService{
    @Autowired
    private PortfolioUserRepository portfolioUserRepository;
    @Override
    public Long addUser(PortfolioUserEntity entity) {
       // if(portfolioUserRepository.findById())
        PortfolioUserEntity portfolioUserEntity = portfolioUserRepository.save(entity);
        return portfolioUserEntity.getUserId();
    }

    @Override
    public List<PortfolioUserEntity> findUserById(Long id) {
        return (List<PortfolioUserEntity>) portfolioUserRepository.findById(id).get();
    }

    @Override
    public PortfolioUserEntity findUserByEmail(String email) {
        return portfolioUserRepository.findByEmail(email);
    }
}
