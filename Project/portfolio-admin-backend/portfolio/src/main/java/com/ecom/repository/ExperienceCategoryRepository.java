package com.ecom.repository;

import com.ecom.entity.ExperienceCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceCategoryRepository extends JpaRepository<ExperienceCategoryEntity,Long> {
    @Query("Select experienceCategoryEntity from ExperienceCategoryEntity experienceCategoryEntity where experienceId=:experienceId")
    List<ExperienceCategoryEntity> findByExperienceId(Long experienceId);
    @Query("Select experienceCategoryEntity from ExperienceCategoryEntity experienceCategoryEntity where experienceId=:experienceId and experienceCategoryId=:experienceCategoryId")
    ExperienceCategoryEntity findCategoryByIds(Long experienceId, Long experienceCategoryId);
}
