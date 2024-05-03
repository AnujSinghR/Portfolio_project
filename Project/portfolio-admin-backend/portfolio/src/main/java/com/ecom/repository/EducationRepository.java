package com.ecom.repository;

import com.ecom.entity.EducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<EducationEntity,Long> {
    @Query("Select educationEntity from EducationEntity educationEntity where portPofolioId=:portfolioId")
    EducationEntity findByportPofolioId(Long portfolioId);
}
