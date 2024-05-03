package com.ecom.component;

import com.ecom.entity.*;
import com.ecom.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyData {

    public void insertData1(PortfolioUserService portfolioUserService, AboutMeServiceImpl aboutMeService, CompetencesService competencesService, EducationService educationService,ExperienceService experienceService,SocialNetworkService socialNetworkService){
        Long userId =portfolioUserService.addUser(PortfolioUserEntity.builder().name("Nicolas Wadoux").email("Nic@test.com").description("IT Student, Web and Mobile developer").photoProfile("https://www.gravatar.com/avatar/4798617496366fdde2c1c3b69d9293e9?s=250&d=mm&r=x").build());
        AboutMeEntity aboutMe = aboutMeService.addAboutMeDetails(AboutMeEntity.builder().description("").portfolioUserId(userId).photoFilePath("C:/user/1.jpg").build());
        AboutMeNavEntity aboutMeNavEntity1 = AboutMeNavEntity.builder().aboutMeName("About").description("Currently in a vacational degree regarding multisupport IT development, in work-study, I am a young student wishing to specialize in web and mobile development. I focus my studies in this area, guided by my desire to learn and my curiosity. As a passionate, I like to actively participate in the activities of a company, but also create personal projects, with the aim of increase my skills.\n" +
                        "\n" +
                        "Web and mobile development appeared as obvious during my schooling. Creating ever more sustainable web applications, concerned about the user experience, is very important for me. Web and mobile technologies are changing our lives, and I want to be part of this change.\n" +
                        "\n" +
                        "If you want to learn more about me, or get in touch, don't hesitate! You can explore this website nor download my CV! :)")
                .imgaeUrl("").
                aboutMeId(aboutMe.getAboutMeId()).isActive(true).build();
        AboutMeNavEntity aboutMeNavEntity2 = AboutMeNavEntity.builder().aboutMeName("Language").description("If you want to learn more about me, or get in touch, don't hesitate! You can explore this website nor download my CV! :)")
                .imgaeUrl("").
                aboutMeId(aboutMe.getAboutMeId()).isActive(true).
                build();
        AboutMeNavEntity aboutMeNavEntity3 = AboutMeNavEntity.builder().aboutMeName("Strength").description("Emotional intelligence: I am empathic, friendly and always optimistic\n" +
                        "Relationship intelligence: Team spirit, always acts to maintain positive cooperation\n" +
                        "Curiosity: I always like to learn more about every possible subjects\n" +
                        "Punctuality and good time management\n" +
                        "Resolving ability: I like to find the simplest solution to meet a need, whether alone or teaming")
                .imgaeUrl("")
                .aboutMeId(aboutMe.getAboutMeId()).isActive(true).build();
        AboutMeNavEntity aboutMeNavEntity4 = AboutMeNavEntity.builder().aboutMeName("Hobbies").description("- Play violin -\n" +
                        "I play violin since 2016.\n" +
                        "\n" +
                        "I participated in charities such as \"Octobre rose\" (Pink October). Also on stage, during senior meals on Christmas holidays, and some concerts in bars!\n" +
                        "\n" +
                        "- Travel / Culture -\n" +
                        "I would like to travel all around the world, other countries and their own culture fascinate me. Without forgetting the culinary culture ;p\n" +
                        "\n" +
                        "- Baking -\n" +
                        "Speaking about food, who doesn't love cakes? Yule logs, verrines, choux buns, macaroons, I love baking!")
                .imgaeUrl("").
                aboutMeId(aboutMe.getAboutMeId()).build();
        aboutMeService.addAboutMeNav(aboutMeNavEntity1);
        aboutMeService.addAboutMeNav(aboutMeNavEntity2);
        aboutMeService.addAboutMeNav(aboutMeNavEntity3);
        aboutMeService.addAboutMeNav(aboutMeNavEntity4);
        CompetencesEntity competencesEntity = CompetencesEntity.builder().portfolioUserId(userId).name("Competences").description("Competences discription").build();
        competencesService.addCompetences(competencesEntity);
        SkillCategoryEntity web = SkillCategoryEntity.builder().skillCategory("Web").competenceId(competencesEntity.getCompetenceId()).build();
        competencesService.addSkillCategory(web);
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(web.getSkillCategoryId()).skillname("HTML/JS/CSS").skillRate(80L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(web.getSkillCategoryId()).skillname("Angular").skillRate(60L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(web.getSkillCategoryId()).skillname("NodeJS").skillRate(70L).build());
        SkillCategoryEntity data_base = SkillCategoryEntity.builder().skillCategory("Data Base").competenceId(competencesEntity.getCompetenceId()).build();
        competencesService.addSkillCategory(data_base);
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(data_base.getSkillCategoryId()).skillname("MySql").skillRate(80L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(data_base.getSkillCategoryId()).skillname("PgSql").skillRate(40L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(data_base.getSkillCategoryId()).skillname("PL/SQL").skillRate(50L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(data_base.getSkillCategoryId()).skillname("Oracle").skillRate(20L).build());
        SkillCategoryEntity programming = SkillCategoryEntity.builder().skillCategory("Programming").competenceId(competencesEntity.getCompetenceId()).build();
        competencesService.addSkillCategory(programming);
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(programming.getSkillCategoryId()).skillname("C#").skillRate(90L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(programming.getSkillCategoryId()).skillname("Kotlin(Android)").skillRate(20L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(programming.getSkillCategoryId()).skillname("Java").skillRate(70L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(programming.getSkillCategoryId()).skillname("UML").skillRate(60L).build());
        SkillCategoryEntity others = SkillCategoryEntity.builder().skillCategory("Others").competenceId(competencesEntity.getCompetenceId()).build();
        competencesService.addSkillCategory(others);
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(others.getSkillCategoryId()).skillname("Scrum").skillRate(90L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(others.getSkillCategoryId()).skillname("GIT/SVN").skillRate(90L).build());
        competencesService.addSkill(SkillEntity.builder().skillCategoryId(others.getSkillCategoryId()).skillname("PhotoShop").skillRate(90L).build());

        EducationEntity educationEntity = EducationEntity.builder().portPofolioId(userId).name("Education Section").educationDescription("Fill about education and ").build();
        EducationEntity educationEntity1 = educationService.addEducation(educationEntity);

        educationService.addEducationDetails(EducationDetailEntity.builder().educationId(educationEntity1.getEducationId()).name("BCA").educationalDescription("I am a diligent Bachelor of Computer Applications (BCA) student, deeply passionate about the dynamic world of technology. Equipped with a solid understanding of programming languages like Java, C++, Python, and SQL, I thrive in problem-solving and software development. Through collaborative projects and coursework, I ve honed my skills in web development, database management, and algorithm design. My commitment to continuous learning drives me to stay updated with the latest advancements in the field. With a blend of technical expertise and a collaborative spirit, I m poised to make impactful contributions in the realm of computer science.")
                .startYear(2003).endYear(2007).build());
        educationService.addEducationDetails(EducationDetailEntity.builder().educationId(educationEntity1.getEducationId()).name("12th").educationalDescription("I am a dedicated 12th-grade student with a keen interest in exploring the world of knowledge and discovery. Eager to excel in academics and beyond, I approach every challenge with enthusiasm and determination. With a strong foundation in subjects like mathematics, science, and literature, I strive to expand my horizons and pursue my passions. Whether it's through participating in extracurricular activities, engaging in community service, or delving into independent projects, I am committed to personal growth and academic excellence. As I prepare to embark on the next chapter of my journey, I am excited to embrace new opportunities and make meaningful contributions to the world around me.")
                .startYear(2002).endYear(2003).build());
        educationService.addEducationDetails(EducationDetailEntity.builder().educationId(educationEntity1.getEducationId()).name("10th").educationalDescription("I am a dedicated 10th-grade student with a keen interest in exploring the world of knowledge and discovery. Eager to excel in academics and beyond, I approach every challenge with enthusiasm and determination. With a strong foundation in subjects like mathematics, science, and literature, I strive to expand my horizons and pursue my passions. Whether it's through participating in extracurricular activities, engaging in community service, or delving into independent projects, I am committed to personal growth and academic excellence. As I prepare to embark on the next chapter of my journey, I am excited to embrace new opportunities and make meaningful contributions to the world around me.")
                .startYear(2000).endYear(2001).build());
      ExperienceEntity experienceEntity = ExperienceEntity.builder().name("Experience").portfolioId(userId).isActive(true).build();
      ExperienceEntity experienceEntity1 = experienceService.addExperience(experienceEntity);
      ExperienceCategoryEntity experienceCategoryEntity1 = ExperienceCategoryEntity.builder().experienceId(experienceEntity1.getExperienceId()).categoryName("Projects").build();
      ExperienceCategoryEntity experienceCategoryEntity2 = ExperienceCategoryEntity.builder().experienceId(experienceEntity1.getExperienceId()).categoryName("Experience").build();
      experienceService.addExperienceCategory(experienceCategoryEntity1);
      experienceService.addExperienceCategory(experienceCategoryEntity2);
      ExperienceDetailsEntity experienceDetailsEntity1= ExperienceDetailsEntity.builder().name("Something1").experienceCategoryId(experienceCategoryEntity1.getExperienceCategoryId()).experiencedescription("This is a portfolio site created for client\n" +
              "html").img("").build();
        ExperienceDetailsEntity experienceDetailsEntity2= ExperienceDetailsEntity.builder().name("Something2").experienceCategoryId(experienceCategoryEntity1.getExperienceCategoryId()).experiencedescription("This is a portfolio site created for client\n" +
                "html").img("").build();
        ExperienceDetailsEntity experienceDetailsEntity3= ExperienceDetailsEntity.builder().name("Something3").experienceCategoryId(experienceCategoryEntity1.getExperienceCategoryId()).experiencedescription("This is a portfolio site created for client\n" +
                "html").img("").build();
        experienceService.addExperienceDetails(experienceDetailsEntity1);
        experienceService.addExperienceDetails(experienceDetailsEntity2);
        experienceService.addExperienceDetails(experienceDetailsEntity3);
        ExperienceDetailsEntity experienceDetailsEntity4= ExperienceDetailsEntity.builder().name("Something4").experienceCategoryId(experienceCategoryEntity2.getExperienceCategoryId()).experiencedescription("This is a portfolio site created for client\n" +
                "html").img("").build();
        ExperienceDetailsEntity experienceDetailsEntity5= ExperienceDetailsEntity.builder().name("Something5").experienceCategoryId(experienceCategoryEntity2.getExperienceCategoryId()).experiencedescription("This is a portfolio site created for client\n" +
                "html").img("").build();
        experienceService.addExperienceDetails(experienceDetailsEntity4);
        experienceService.addExperienceDetails(experienceDetailsEntity5);
        socialNetworkService.addSocialNetwork(SocialNetworkEntity.builder().portfolioId(userId).name("LinkedIn").url("http://linkedin.com").build());
        socialNetworkService.addSocialNetwork(SocialNetworkEntity.builder().portfolioId(userId).name("Facebook").url("http://Facebook.com").build());
        socialNetworkService.addSocialNetwork(SocialNetworkEntity.builder().portfolioId(userId).name("Insta").url("http://Insta.com").build());
    }


}
