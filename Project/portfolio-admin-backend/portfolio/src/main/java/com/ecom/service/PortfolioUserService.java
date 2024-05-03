package com.ecom.service;

import com.ecom.entity.PortfolioUserEntity;

import java.util.List;

public interface PortfolioUserService {
    Long addUser(PortfolioUserEntity entity);
    List<PortfolioUserEntity> findUserById(Long id);

    PortfolioUserEntity findUserByEmail(String id);

}
