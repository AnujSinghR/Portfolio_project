package com.ecom.repository;

import com.ecom.entity.CompetencesEntity;
import com.ecom.entity.SkillCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillCategoryRepository extends JpaRepository<SkillCategoryEntity,Long> {
    @Query("Select skillCategoryEntity from SkillCategoryEntity skillCategoryEntity where competenceId=:competenceId")
    List<SkillCategoryEntity> findByCompetenceId(Long competenceId);
}
