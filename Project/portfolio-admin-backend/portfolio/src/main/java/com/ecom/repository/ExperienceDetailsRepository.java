package com.ecom.repository;

import com.ecom.entity.ExperienceDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceDetailsRepository extends JpaRepository<ExperienceDetailsEntity,Long> {
    @Query("Select experienceDetailsEntity from ExperienceDetailsEntity experienceDetailsEntity where experienceCategoryId=:experienceCategoryId")
    List<ExperienceDetailsEntity> findByExperienceCategoryId(Long experienceCategoryId);
    @Query("Select experienceDetailsEntity from ExperienceDetailsEntity experienceDetailsEntity where experienceCategoryId=:experienceCategoryId and experienceDetailId=:experienceDetailId")
    ExperienceDetailsEntity findExperienceDetailsByIds(Long experienceCategoryId, Long experienceDetailId);
}
