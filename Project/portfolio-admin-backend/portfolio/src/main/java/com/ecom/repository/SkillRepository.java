package com.ecom.repository;

import com.ecom.entity.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<SkillEntity,Long> {
    @Query("Select skillEntity from SkillEntity skillEntity where skillCategoryId=:skillCategoryId")
    List<SkillEntity> findByCompetenceId(Long skillCategoryId);
}
