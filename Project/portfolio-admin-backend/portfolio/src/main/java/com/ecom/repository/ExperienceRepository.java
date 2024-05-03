package com.ecom.repository;

import com.ecom.entity.ExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<ExperienceEntity,Long> {
    @Query("Select experienceEntity from ExperienceEntity experienceEntity where portfolioId=:portfolioId")
    ExperienceEntity findByPortfolioId(Long portfolioId);
}
