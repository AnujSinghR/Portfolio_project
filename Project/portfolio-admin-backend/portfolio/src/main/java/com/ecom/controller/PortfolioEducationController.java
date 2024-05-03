package com.ecom.controller;

import com.ecom.dto.EducationRequestDto;
import com.ecom.dto.PortfolioRequestDto;
import com.ecom.dto.UpdateAndSaveResponseDto;
import com.ecom.dto.client.EducationDetailModel;
import com.ecom.dto.client.EducationModel;
import com.ecom.entity.EducationDetailEntity;
import com.ecom.entity.EducationEntity;
import com.ecom.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PortfolioEducationController {
    @Autowired
    private EducationService educationService;
    @PostMapping("fetch-education")
    @CrossOrigin(origins = "http://localhost:4200")
    public EducationModel fetechEducation(@RequestBody PortfolioRequestDto portfolioRequestDto){
        EducationEntity educationEntity = educationService.findByPortfolioId(portfolioRequestDto.getPortfolioId());
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
        return educationModel;
    }
    @PostMapping("update-education")
    @CrossOrigin(origins = "http://localhost:4200")
    public UpdateAndSaveResponseDto updateEducation(@RequestBody EducationRequestDto educationRequestDto){
        try {
            EducationEntity educationEntity = educationService.findByPortfolioId(educationRequestDto.getPortPofolioId());
            EducationDetailEntity educationDetailEntity = educationService.findByEducationDetailsId(educationEntity.getEducationId(), educationRequestDto.getEducationDetailId());
            educationDetailEntity.setName(educationRequestDto.getEducationname());
            educationDetailEntity.setEducationalDescription(educationRequestDto.getEducationdescription());
            educationDetailEntity.setStartYear(educationRequestDto.getStartyear());
            educationDetailEntity.setEndYear(educationRequestDto.getEndyear());
            educationService.addEducationDetails(educationDetailEntity);
        }catch (Exception ex){
            return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.EXPECTATION_FAILED).description(ex.getMessage()).build();
        }
        return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.OK).description("Education updated").build();
    }

    @PostMapping("add-education")
    @CrossOrigin(origins = "http://localhost:4200")
    public UpdateAndSaveResponseDto addEducation(@RequestBody EducationRequestDto educationRequestDto){
        try {
            EducationDetailEntity educationDetailEntity = EducationDetailEntity.builder()
                    .educationId(educationRequestDto.getEducationId())
                    .name(educationRequestDto.getEducationname())
                    .educationalDescription(educationRequestDto.getEducationdescription())
                    .startYear(educationRequestDto.getStartyear())
                    .endYear(educationRequestDto.getEndyear()).build();
            educationService.addEducationDetails(educationDetailEntity);
        }catch (Exception ex){
            return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.EXPECTATION_FAILED).description(ex.getMessage()).build();
        }
        return UpdateAndSaveResponseDto.builder().httpStatus(HttpStatus.OK).description("Education added").build();
    }
}
