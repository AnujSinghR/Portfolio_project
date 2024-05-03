package com.ecom.service;

import com.ecom.entity.ExperienceCategoryEntity;
import com.ecom.entity.ExperienceDetailsEntity;
import com.ecom.entity.ExperienceEntity;

import java.util.List;

public interface ExperienceService {

    ExperienceEntity addExperience(ExperienceEntity experienceEntity);

    ExperienceCategoryEntity addExperienceCategory(ExperienceCategoryEntity experienceCategoryEntity);
    ExperienceDetailsEntity addExperienceDetails(ExperienceDetailsEntity experienceDetailsEntity);
    ExperienceEntity findByPortfolioId(Long portfolioId);

    List<ExperienceCategoryEntity> findByExperienceId(Long experienceId);

    ExperienceCategoryEntity findCategoryByIds(Long experienceId,Long experienceCategoryId);

    List<ExperienceDetailsEntity> findByExperienceCategoryId(Long experienceCategoryId);
    ExperienceDetailsEntity findExperienceDetailsByIds(Long experienceCategoryId,Long experienceDetailId);


}
