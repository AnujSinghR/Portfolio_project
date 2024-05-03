package com.ecom.service;

import com.ecom.entity.ExperienceCategoryEntity;
import com.ecom.entity.ExperienceDetailsEntity;
import com.ecom.entity.ExperienceEntity;
import com.ecom.repository.ExperienceCategoryRepository;
import com.ecom.repository.ExperienceDetailsRepository;
import com.ecom.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService{
    @Autowired
    private ExperienceRepository experienceRepository;
    @Autowired
    private ExperienceCategoryRepository experienceCategoryRepository;
    @Autowired
    private ExperienceDetailsRepository experienceDetailsRepository;

    @Override
    public ExperienceEntity addExperience(ExperienceEntity experienceEntity) {
        return experienceRepository.save(experienceEntity);
    }
    @Override
    public ExperienceCategoryEntity addExperienceCategory(ExperienceCategoryEntity experienceCategoryEntity) {
        return experienceCategoryRepository.save(experienceCategoryEntity);
    }
    @Override
    public ExperienceDetailsEntity addExperienceDetails(ExperienceDetailsEntity experienceDetailsEntity) {
        return experienceDetailsRepository.save(experienceDetailsEntity);
    }
    @Override
    public ExperienceEntity findByPortfolioId(Long portfolioId) {
        return experienceRepository.findByPortfolioId(portfolioId);
    }

    @Override
    public List<ExperienceCategoryEntity> findByExperienceId(Long experienceId) {
        return experienceCategoryRepository.findByExperienceId(experienceId);
    }

    @Override
    public ExperienceCategoryEntity findCategoryByIds(Long experienceId, Long experienceCategoryId) {
        return experienceCategoryRepository.findCategoryByIds(experienceId,experienceCategoryId);
    }

    @Override
    public List<ExperienceDetailsEntity> findByExperienceCategoryId(Long experienceCategoryId) {
        return experienceDetailsRepository.findByExperienceCategoryId(experienceCategoryId);
    }

    @Override
    public ExperienceDetailsEntity findExperienceDetailsByIds(Long experienceCategoryId, Long experienceDetailId) {
        return experienceDetailsRepository.findExperienceDetailsByIds(experienceCategoryId,experienceDetailId);
    }


}
