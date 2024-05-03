package com.ecom.controller;

import com.ecom.dto.*;
import com.ecom.dto.model.SkillCategoryModelObj;
import com.ecom.entity.CompetencesEntity;
import com.ecom.entity.SkillCategoryEntity;
import com.ecom.entity.SkillEntity;
import com.ecom.service.CompetencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PortfolioCompetencesController {

    @Autowired
    private CompetencesService competencesService;
    @PostMapping("fetchcompetence")
    @CrossOrigin(origins = "http://localhost:4200")
    public CompetenceResponseDto findSkillCategory(@RequestBody PortfolioRequestDto portfolioRequestDto){

        CompetencesEntity competence = competencesService.findCompetence(portfolioRequestDto.getPortfolioId());

        List<SkillCategoryEntity> skillCategory = competencesService.findSkillCategoryById(competence.getCompetenceId());
        CompetenceResponseDto competenceDto = CompetenceResponseDto.builder().competencesEntity(competence).build();
        List<SkillCategoryModelObj> skillCategoryModelObjList= new ArrayList<>();
        for (SkillCategoryEntity skillCategoryEntity:skillCategory){
            SkillCategoryModelObj skillCategoryModelObj = new SkillCategoryModelObj();
            List<SkillEntity> skillById = competencesService.findSkillById(skillCategoryEntity.getSkillCategoryId());
            skillCategoryModelObj.setSkillModelObjectList(skillById);
            skillCategoryModelObj.setSkillCategoryId(skillCategoryEntity.getSkillCategoryId());
            skillCategoryModelObj.setSkillCategory(skillCategoryEntity.getSkillCategory());
            skillCategoryModelObjList.add(skillCategoryModelObj);
        }
        competenceDto.setSkillCategoryModelObjList(skillCategoryModelObjList);

        return competenceDto;
    }

    @PostMapping("updatecompetences")
    @CrossOrigin(origins = "http://localhost:4200")
    public UpdateAndSaveResponseDto updateCompetences(@RequestBody CompetenceRequestDto portfolioRequestDto){
        SkillCategoryEntity skillCategory = competencesService.findSkillCategoryBySkillCategoryId(portfolioRequestDto.getSkillCategoryId());
        skillCategory.setSkillCategory(portfolioRequestDto.getSkillcategoryname());
        competencesService.addSkillCategory(skillCategory);
        SkillEntity skillBySkillId = competencesService.findSkillBySkillId(portfolioRequestDto.getSkillId());
        skillBySkillId.setSkillname(portfolioRequestDto.getSkillname());
        skillBySkillId.setSkillRate(portfolioRequestDto.getSkillrate());
        competencesService.addSkill(skillBySkillId);
        return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.OK).description("Item has been successfully saved/updated in db").build();
    }

    @PostMapping("addskill")
    @CrossOrigin(origins = "http://localhost:4200")
    public UpdateAndSaveResponseDto addCompetences(@RequestBody SkillRequestDto skillRequestDto){
        SkillCategoryEntity skillCategoryEntity = SkillCategoryEntity.builder().competenceId(skillRequestDto.getCompetenceId()).skillCategory(skillRequestDto.getAddskillcategoryname()).build();
        try {
            SkillCategoryEntity skillCategory= competencesService.addSkillCategory(skillCategoryEntity);
            for(String skill: skillRequestDto.getFields()){
                SkillEntity skillEntity = SkillEntity.builder().skillCategoryId(skillCategory.getSkillCategoryId()).skillname(skill).build();
                competencesService.addSkill(skillEntity);
            }
        }catch (Exception ex){
            return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.EXPECTATION_FAILED).description("something went wrong").build();
        }

        return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.OK).description("Item has been successfully saved/updated in db").build();
    }

}
