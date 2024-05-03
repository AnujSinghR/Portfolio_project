package com.ecom.service;

import com.ecom.entity.EducationDetailEntity;
import com.ecom.entity.EducationEntity;

import java.util.List;

public interface EducationService {
    EducationEntity addEducation(EducationEntity educationEntity);
    EducationDetailEntity addEducationDetails(EducationDetailEntity educationEntity);

    EducationEntity findByPortfolioId(Long portfolioId);

    List<EducationDetailEntity> findByEducationId(Long educationId);
    EducationDetailEntity findByEducationDetailsId(Long educationId,Long educationDetailId);
}
