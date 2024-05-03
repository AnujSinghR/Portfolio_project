package com.ecom.repository;

import com.ecom.entity.SocialNetworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialNetworkRepository extends JpaRepository<SocialNetworkEntity,Long> {
    @Query("Select socialNetworkEntity from SocialNetworkEntity socialNetworkEntity where portfolioId=:portfolioId")
    List<SocialNetworkEntity> findByPortfolioId(Long portfolioId);
}
