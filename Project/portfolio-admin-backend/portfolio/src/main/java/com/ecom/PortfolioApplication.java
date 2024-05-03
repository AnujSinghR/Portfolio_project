package com.ecom;

import com.ecom.component.DummyData;
import com.ecom.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PortfolioApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class,args);


    }
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
    @Override
    public void run(String... args) throws Exception {

     new DummyData().insertData1(portfolioUserService,aboutMeService,competencesService,educationService,experienceService,socialNetworkService);
    }
}
