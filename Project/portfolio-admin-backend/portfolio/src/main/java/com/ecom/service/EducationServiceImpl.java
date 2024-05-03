package com.ecom.service;

import com.ecom.entity.EducationDetailEntity;
import com.ecom.entity.EducationEntity;
import com.ecom.repository.EducationDetailRepository;
import com.ecom.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService{
    @Autowired
    private EducationRepository educationRepository;
    @Autowired
    private EducationDetailRepository educationDetailRepository;
    @Override
    public EducationEntity addEducation(EducationEntity educationEntity) {
        EducationEntity educationEntity1 = educationRepository.save(educationEntity);
        return educationEntity1;
    }

    @Override
    public EducationDetailEntity addEducationDetails(EducationDetailEntity educationDetailEntity) {
        EducationDetailEntity educationDetailEntity1 = educationDetailRepository.save(educationDetailEntity);
        return educationDetailEntity1;
    }

    @Override
    public EducationEntity findByPortfolioId(Long portfolioId) {
        return educationRepository.findByportPofolioId(portfolioId);
    }

    @Override
    public List<EducationDetailEntity> findByEducationId(Long educationId) {
        return educationDetailRepository.findByEducationId(educationId);
    }

    @Override
    public EducationDetailEntity findByEducationDetailsId(Long educationId, Long educationDetailId) {
        return educationDetailRepository.findByEducationDetailsId(educationId,educationDetailId);
    }
}
