package com.ecom.repository;

import com.ecom.entity.PortfolioUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioUserRepository extends JpaRepository<PortfolioUserEntity,Long> {
    PortfolioUserEntity findByEmail(String email);
    // Object save(PortfolioUserEntity entity);
}
