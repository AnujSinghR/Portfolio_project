package com.ecom.repository;

import com.ecom.entity.CompetencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetencesRepository extends JpaRepository<CompetencesEntity,Long> {
    @Query("Select competencesEntity from CompetencesEntity competencesEntity where portfolioUserId=:portfolioId")
    CompetencesEntity findByPortfolioUserId(Long portfolioId);
}
