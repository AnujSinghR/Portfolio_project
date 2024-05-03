package com.ecom.controller;

import com.ecom.dto.PortfolioClientRequestDto;
import com.ecom.dto.PortfolioClientResponseDto;
import com.ecom.dto.client.*;
import com.ecom.entity.*;
import com.ecom.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PortFolioClientController {
    @Autowired
    private PortfolioUserService portfolioUserService;
    @Autowired
    private AboutMeServiceImpl aboutMeService;

    @Autowired
    private CompetencesService competencesService;
    @Autowired
    private EducationService educationService;
    @Autowired
    private ExperienceService experienceService;
    @Autowired
    private SocialNetworkService socialNetworkService;
    @PostMapping("client")
    @CrossOrigin(origins = "http://localhost:4200")
    public PortfolioClientResponseDto getClientResponse(@RequestBody PortfolioClientRequestDto portfolioClientRequestDto){
        PortfolioUserEntity userByEmail = portfolioUserService.findUserByEmail(portfolioClientRequestDto.getEmail());
        AboutMeEntity aboutMeEntity= aboutMeService.findAboutMe(userByEmail.getUserId());
        List<AboutMeNavEntity> aboutMeNav = aboutMeService.findAboutMeNav(aboutMeEntity.getAboutMeId());
        AboutMeModel aboutMeModel = AboutMeModel.builder().aboutMeNav(aboutMeNav).portfolioUserId(aboutMeEntity.getPortfolioUserId()).photoFilePath(aboutMeEntity.getPhotoFilePath()).description(aboutMeEntity.getDescription()).aboutMeId(aboutMeEntity.getAboutMeId()).build();
        CompetencesEntity competence = competencesService.findCompetence(userByEmail.getUserId());
        List<SkillCategoryEntity> skillCategory = competencesService.findSkillCategoryById(competence.getCompetenceId());
        CompetecesModel competecesModel = CompetecesModel.builder().competenceId(competence.getCompetenceId()).portfolioUserId(competence.getPortfolioUserId()).name(competence.getName()).description(competence.getDescription()).build();
        List<SkillCategoryModel> skillCategoryModelList = new ArrayList<>();
        for (SkillCategoryEntity skillCategoryEntity : skillCategory){
            List<SkillEntity> skills= competencesService.findSkillById(skillCategoryEntity.getSkillCategoryId());
            SkillCategoryModel skillCategoryModel = SkillCategoryModel.builder().skillCategoryId(skillCategoryEntity.getSkillCategoryId()).skillCategory(skillCategoryEntity.getSkillCategory())
                    .competenceId(skillCategoryEntity.getCompetenceId()).skillEntityList(skills).build();
            skillCategoryModelList.add(skillCategoryModel);
        }
        competecesModel.setSkillCategory(skillCategoryModelList);
        EducationEntity educationEntity = educationService.findByPortfolioId(userByEmail.getUserId());
        EducationModel educationModel = EducationModel.builder().educationId(educationEntity.getEducationId()).name(educationEntity.getName())
                .portPofolioId(educationEntity.getPortPofolioId()).educationDescription(educationEntity.getEducationDescription())
                .enable(true).build();
        List<EducationDetailEntity> educationDetailEntityList = educationService.findByEducationId(educationEntity.getEducationId());
        List<EducationDetailModel> educationDetailModelList = new ArrayList<>();
        for (EducationDetailEntity EducationDetailEntity:educationDetailEntityList){
             EducationDetailModel educationDetailModel = EducationDetailModel.builder().name(EducationDetailEntity.getName()).educationId(EducationDetailEntity.getEducationId()).educationDetailId(EducationDetailEntity.getEducationDetailId())
                    .educationalDescription(EducationDetailEntity.getEducationalDescription()).endYear(EducationDetailEntity.getEndYear()).startYear(EducationDetailEntity.getStartYear())
                    .build();
            educationDetailModelList.add(educationDetailModel);
        }
        educationModel.setEducationDetailModelList(educationDetailModelList);

        ExperienceEntity experienceEntity = experienceService.findByPortfolioId(userByEmail.getUserId());
        ExperienceModel experienceModel = ExperienceModel.builder().name(experienceEntity.getName()).experienceId(experienceEntity.getExperienceId())
                .portfolioId(experienceEntity.getPortfolioId()).enable(true).build();
        List<ExperienceCategoryEntity> experienceCategoryEntityList=  experienceService.findByExperienceId(experienceEntity.getExperienceId());
        List<ExperienceCategoryModel> experienceCategoryModelList = new ArrayList<>();
        for (ExperienceCategoryEntity experienceCategoryEntity: experienceCategoryEntityList){
            experienceCategoryModelList.add(ExperienceCategoryModel.builder().experienceCategoryId(experienceCategoryEntity.getExperienceCategoryId())
                    .experienceId(experienceCategoryEntity.getExperienceId()).categoryName(experienceCategoryEntity.getCategoryName()).experienceDetailsEntities(experienceService.findByExperienceCategoryId(experienceCategoryEntity.getExperienceCategoryId())).build());
        }
        experienceModel.setExperienceCategoryModelList(experienceCategoryModelList);
        List<SocialNetworkEntity> socialNetworkEntity= socialNetworkService.findByportfolioid(userByEmail.getUserId());
        SocialNetworkModel socialNetworkModel = SocialNetworkModel.builder().socialNetwork(socialNetworkEntity).build();
        return  PortfolioClientResponseDto.builder().portfolio(userByEmail).aboutUs(aboutMeModel).competeces(competecesModel).education(educationModel).experience(experienceModel).socialNetwork(socialNetworkModel).build();
    }
}
