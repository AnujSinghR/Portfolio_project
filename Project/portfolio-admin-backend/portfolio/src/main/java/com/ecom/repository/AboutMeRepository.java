package com.ecom.repository;

import com.ecom.entity.AboutMeEntity;
import com.ecom.entity.AboutMeNavEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AboutMeRepository extends JpaRepository<AboutMeEntity,Long> {
    AboutMeEntity findByPortfolioUserId(Long id);
    @Query("Select aboutMeEntity from AboutMeEntity aboutMeEntity where portfolioUserId=:portfolioId")
    AboutMeEntity findAboutMeByPortfolioId(Long portfolioId);
}
