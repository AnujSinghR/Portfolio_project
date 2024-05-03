package com.ecom.controller;

import com.ecom.dto.ExperienceUpdateRequestDto;
import com.ecom.dto.PortfolioRequestDto;
import com.ecom.dto.UpdateAndSaveResponseDto;
import com.ecom.dto.client.ExperienceCategoryModel;
import com.ecom.dto.client.ExperienceModel;
import com.ecom.entity.ExperienceCategoryEntity;
import com.ecom.entity.ExperienceDetailsEntity;
import com.ecom.entity.ExperienceEntity;
import com.ecom.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PortfolioExperienceController {
    @Autowired
    private ExperienceService experienceService;
    @PostMapping("fetch-experience")
    @CrossOrigin(origins = "http://localhost:4200")
    public ExperienceModel fetchExperience(@RequestBody PortfolioRequestDto portfolioRequestDto){
        ExperienceEntity experienceEntity = experienceService.findByPortfolioId(portfolioRequestDto.getPortfolioId());
        ExperienceModel experienceModel = ExperienceModel.builder().name(experienceEntity.getName()).experienceId(experienceEntity.getExperienceId())
                .portfolioId(experienceEntity.getPortfolioId()).enable(true).build();
        List<ExperienceCategoryEntity> experienceCategoryEntityList=  experienceService.findByExperienceId(experienceEntity.getExperienceId());
        List<ExperienceCategoryModel> experienceCategoryModelList = new ArrayList<>();
        for (ExperienceCategoryEntity experienceCategoryEntity: experienceCategoryEntityList){
            experienceCategoryModelList.add(ExperienceCategoryModel.builder().experienceCategoryId(experienceCategoryEntity.getExperienceCategoryId())
                    .experienceId(experienceCategoryEntity.getExperienceId()).categoryName(experienceCategoryEntity.getCategoryName()).experienceDetailsEntities(experienceService.findByExperienceCategoryId(experienceCategoryEntity.getExperienceCategoryId())).build());
        }
        experienceModel.setExperienceCategoryModelList(experienceCategoryModelList);
        return experienceModel;
    }

    @PostMapping("update-experience")
    @CrossOrigin(origins = "http://localhost:4200")
    public UpdateAndSaveResponseDto updateExperience(@RequestBody ExperienceUpdateRequestDto experienceUpdateRequestDto){
        try{
            ExperienceEntity experienceEntity = experienceService.findByPortfolioId(experienceUpdateRequestDto.getPortfolioId());
            ExperienceCategoryEntity experienceCategoryEntity = experienceService.findCategoryByIds(experienceEntity.getExperienceId(),experienceUpdateRequestDto.getExperiencecategoryId());
            experienceCategoryEntity.setCategoryName(experienceUpdateRequestDto.getUpdatecategoryName());
            experienceService.addExperienceCategory(experienceCategoryEntity);
            ExperienceDetailsEntity experienceDetailsEntity = experienceService.findExperienceDetailsByIds(experienceCategoryEntity.getExperienceCategoryId(), experienceUpdateRequestDto.getUpdateexperiendetailsId());
            experienceDetailsEntity.setName(experienceUpdateRequestDto.getUpdateexperienceDetailname());
            experienceDetailsEntity.setExperiencedescription(experienceUpdateRequestDto.getUpdateexperiencedescription());
            experienceDetailsEntity.setImg(experienceUpdateRequestDto.getImg());
            experienceService.addExperienceDetails(experienceDetailsEntity);
        }catch (Exception ex){
            return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.EXPECTATION_FAILED).description(ex.getMessage()).build();
        }
            return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.OK).description("Education added").build();
        }
}
