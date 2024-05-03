package com.ecom.controller;


import com.ecom.dto.CompetenceResponseDto;
import com.ecom.dto.PortfolioAboutMeResponseDto;
import com.ecom.dto.PortfolioUserRequestDto;
import com.ecom.dto.PortfolioUserResponseDto;
import com.ecom.entity.AboutMeEntity;
import com.ecom.entity.AboutMeNavEntity;
import com.ecom.entity.CompetencesEntity;
import com.ecom.entity.PortfolioUserEntity;
import com.ecom.service.AboutMeService;
import com.ecom.service.CompetencesService;
import com.ecom.service.PortfolioUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/")
@Api(tags = "PortfolioUserController")
public class PortfolioUserController {
    @Autowired
    private PortfolioUserService portfolioUserService;
    @Autowired
    private AboutMeService aboutMeService;

    @Autowired
    private CompetencesService competencesService;

    @PostMapping("addUser")
    @CrossOrigin(origins = "http://localhost:4200")
    public PortfolioUserResponseDto addUser(@RequestBody PortfolioUserRequestDto portfolioUserRequestDto){
        if(!"".equals(portfolioUserRequestDto.getEmail())) {
            PortfolioUserEntity portfolioUserEntity = portfolioUserService.findUserByEmail(portfolioUserRequestDto.getEmail());
            PortfolioUserEntity build =null;
            if(portfolioUserRequestDto.getEmail().equals(portfolioUserEntity.getEmail())){
                portfolioUserEntity.setName(portfolioUserRequestDto.getName());
                portfolioUserEntity.setEmail(portfolioUserRequestDto.getEmail());
                if(portfolioUserRequestDto.getPhotoProfile() != null || !"".equals(portfolioUserRequestDto.getPhotoProfile()))
                portfolioUserEntity.setPhotoProfile(portfolioUserRequestDto.getPhotoProfile());
                portfolioUserEntity.setDescription(portfolioUserRequestDto.getDescription());
                portfolioUserService.addUser(portfolioUserEntity);
            }else{
                build = PortfolioUserEntity.builder().email(portfolioUserRequestDto.getEmail()).name(portfolioUserRequestDto.getName()).build();
                portfolioUserService.addUser(build);
            }

        }
        return PortfolioUserResponseDto.builder().build();
    }
    @PostMapping("portfolio")
    @CrossOrigin(origins = "http://localhost:4200")
    public PortfolioUserResponseDto getPortfolio(@RequestBody PortfolioUserRequestDto portfolioUserRequestDto){
        PortfolioUserEntity portfolioUserEntity = portfolioUserService.findUserByEmail(portfolioUserRequestDto.getEmail());

        return new PortfolioUserResponseDto(portfolioUserEntity);
    }
    @GetMapping("aboutme/{userId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public PortfolioAboutMeResponseDto getAboutme(@PathVariable("userId") String userId){
        AboutMeEntity aboutMe = aboutMeService.findAboutMe(Long.valueOf(userId));
        List<AboutMeNavEntity> aboutMeNav =aboutMeService.findAboutMeNav(aboutMe.getAboutMeId());
        return PortfolioAboutMeResponseDto.builder().aboutMeEntity(aboutMe).aboutMeNavEntity(aboutMeNav).build();
    }

    @GetMapping("competences/{userId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public CompetenceResponseDto getCompetences(@PathVariable("userId") String userId){
        CompetencesEntity competence = competencesService.findCompetence(Long.valueOf(userId));
       // List<AboutMeNavEntity> aboutMeNav =aboutMeService.findAboutMeNav(aboutMe.getAboutMeId());
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();
        IntStream.of(new int[]{}).sum();
        return CompetenceResponseDto.builder().competencesEntity(competence).build();

    }
}
