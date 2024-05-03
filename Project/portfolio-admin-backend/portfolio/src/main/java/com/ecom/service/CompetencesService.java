package com.ecom.service;

import com.ecom.entity.CompetencesEntity;
import com.ecom.entity.SkillCategoryEntity;
import com.ecom.entity.SkillEntity;

import java.util.List;

public interface CompetencesService {
    CompetencesEntity addCompetences(CompetencesEntity competencesEntity);
    SkillCategoryEntity addSkillCategory(SkillCategoryEntity skillCategoryEntity);
    SkillEntity addSkill(SkillEntity skillEntity);

    SkillCategoryEntity findSkillCategoryBySkillCategoryId(Long skillCategoryId);
    SkillEntity findSkillBySkillId(Long skillId);
    CompetencesEntity findCompetence(Long portfolioId);
    List<SkillCategoryEntity> findSkillCategoryById(Long competenceId);
    List<SkillEntity> findSkillById(Long skillCategoryId);
}
