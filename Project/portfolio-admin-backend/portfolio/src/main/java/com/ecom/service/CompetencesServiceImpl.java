package com.ecom.service;

import com.ecom.entity.CompetencesEntity;
import com.ecom.entity.SkillCategoryEntity;
import com.ecom.entity.SkillEntity;
import com.ecom.repository.CompetencesRepository;
import com.ecom.repository.SkillCategoryRepository;
import com.ecom.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetencesServiceImpl implements CompetencesService{

    @Autowired
    private CompetencesRepository competencesRepository;
    @Autowired
    private SkillCategoryRepository skillCategoryRepository;
    @Autowired
    private SkillRepository skillRepository;
    @Override
    public CompetencesEntity addCompetences(CompetencesEntity competencesEntity) {
        return competencesRepository.save(competencesEntity);
    }

    @Override
    public SkillCategoryEntity addSkillCategory(SkillCategoryEntity skillCategoryEntity) {
        return skillCategoryRepository.save(skillCategoryEntity);
    }

    @Override
    public SkillEntity addSkill(SkillEntity skillEntity) {
        return skillRepository.save(skillEntity);
    }
    @Override
    public CompetencesEntity findCompetence(Long portfolioId){
       return competencesRepository.findByPortfolioUserId(portfolioId);
    }
    @Override
    public SkillCategoryEntity findSkillCategoryBySkillCategoryId(Long skillCategoryId){
        return skillCategoryRepository.findById(skillCategoryId).get();
    }

    @Override
    public SkillEntity findSkillBySkillId(Long skillId) {
        return skillRepository.findById(skillId).get();
    }

    @Override
    public List<SkillCategoryEntity> findSkillCategoryById(Long competenceId){
        return skillCategoryRepository.findByCompetenceId(competenceId);
    }
    @Override
    public List<SkillEntity> findSkillById(Long skillCategoryId){
        return skillRepository.findByCompetenceId(skillCategoryId);
    }
}
