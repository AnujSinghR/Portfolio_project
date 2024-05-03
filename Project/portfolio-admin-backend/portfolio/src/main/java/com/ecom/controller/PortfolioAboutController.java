package com.ecom.controller;

import com.ecom.dto.*;
import com.ecom.dto.model.AboutmeNavObj;
import com.ecom.entity.AboutMeEntity;
import com.ecom.entity.AboutMeNavEntity;
import com.ecom.entity.PortfolioUserEntity;
import com.ecom.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PortfolioAboutController {

    @Autowired
    private AboutMeService aboutMeService;
    @PostMapping("aboutme")
    @CrossOrigin(origins = "http://localhost:4200")
    public PortfolioAboutMeResponseDto getPortfolio(@RequestBody PortfolioRequestDto portfolioRequestDto){
        AboutMeEntity aboutMe = aboutMeService.findAboutMe(portfolioRequestDto.getPortfolioId());
        List<AboutMeNavEntity> aboutMeNav = aboutMeService.findAboutMeNav(aboutMe.getAboutMeId());
        return PortfolioAboutMeResponseDto.builder().aboutMeEntity(aboutMe).aboutMeNavEntity(aboutMeNav).build();
    }
    @PostMapping("updateAboutme")
    @CrossOrigin(origins = "http://localhost:4200")
    public PortfolioSaveUpdateResponseDto updateAboutMe(@RequestBody AboutMeNarRequestDto aboutMeNarRequestDto){
        AboutMeEntity aboutMe = aboutMeService.findAboutMeByPortfolioId(aboutMeNarRequestDto.getPortfolioId());
       // AboutMeEntity aboutMe = aboutMeService.findAboutMe(aboutMeNarRequestDto.getAboutMeId());
          if((!"".equals(aboutMeNarRequestDto.getAboutmedesc()) && aboutMeNarRequestDto.getAboutmedesc() !=null)|| (aboutMeNarRequestDto.getAboutmefileurl()!=null && !"".equals(aboutMeNarRequestDto.getAboutmefileurl()))){
              if(!"".equals(aboutMeNarRequestDto.getAboutmedesc()) && aboutMeNarRequestDto.getAboutmedesc() !=null){
                  aboutMe.setDescription(aboutMeNarRequestDto.getAboutmedesc());
              }
              if(aboutMeNarRequestDto.getAboutmefileurl()!=null && !"".equals(aboutMeNarRequestDto.getAboutmefileurl())){
                  aboutMe.setPhotoFilePath(aboutMeNarRequestDto.getAboutmefileurl());
              }
              aboutMeService.addAboutMeDetails(aboutMe);
          }
        List<AboutmeNavObj> aboutmeNavObjList = aboutMeNarRequestDto.getAboutmeNav();
        for(AboutmeNavObj aboutmeNavObj:aboutmeNavObjList){
            AboutMeNavEntity aboutmeNav = aboutMeService.findAboutmeNav(aboutMeNarRequestDto.getAboutMeId(), aboutmeNavObj.getAboutmeNavId());
            if((aboutmeNavObj.getDescription().get(1)!=null && !"".equals(aboutmeNavObj.getDescription().get(1))) || (aboutmeNavObj.getIsActive().get(1)!=null && !"".equals(aboutmeNavObj.getIsActive().get(1)))){
                if(aboutmeNavObj.getDescription().get(1)!=null && !"".equals(aboutmeNavObj.getDescription().get(1))){
                    aboutmeNav.setDescription(aboutmeNavObj.getDescription().get(1));
                }
                if(aboutmeNavObj.getIsActive().get(1)!=null && !"".equals(aboutmeNavObj.getIsActive().get(1))){
                    aboutmeNav.setActive(Boolean.valueOf(aboutmeNavObj.getIsActive().get(1)));
                }
            aboutMeService.addAboutMeNav(aboutmeNav);
            }
        }
        return PortfolioSaveUpdateResponseDto.builder().status(HttpStatus.OK.getReasonPhrase()).message("information successfully updated").build();
    }

//    @PostMapping("addAboutme")
//    @CrossOrigin(origins = "http://localhost:4200")
//    public PortfolioSaveUpdateResponseDto addAboutMe(@RequestBody AboutMeNarRequestDto aboutMeNarRequestDto){
//        AboutMeEntity aboutMe = aboutMeService.findAboutMe(aboutMeNarRequestDto.getAboutMeId());
//        if((!"".equals(aboutMeNarRequestDto.getAboutmedesc()) && aboutMeNarRequestDto.getAboutmedesc() !=null)|| (aboutMeNarRequestDto.getAboutmefileurl()!=null && !"".equals(aboutMeNarRequestDto.getAboutmefileurl()))){
//            if(!"".equals(aboutMeNarRequestDto.getAboutmedesc()) && aboutMeNarRequestDto.getAboutmedesc() !=null){
//                aboutMe.setDescription(aboutMeNarRequestDto.getAboutmedesc());
//            }
//            if(aboutMeNarRequestDto.getAboutmefileurl()!=null && !"".equals(aboutMeNarRequestDto.getAboutmefileurl())){
//                aboutMe.setPhotoFilePath(aboutMeNarRequestDto.getAboutmefileurl());
//            }
//            aboutMeService.addAboutMeDetails(aboutMe);
//        }
//        List<AboutmeNavObj> aboutmeNavObjList = aboutMeNarRequestDto.getAboutmeNav();
//        for(AboutmeNavObj aboutmeNavObj:aboutmeNavObjList){
//            AboutMeNavEntity aboutmeNav = aboutMeService.findAboutmeNav(aboutMeNarRequestDto.getAboutMeId(), aboutmeNavObj.getAboutmeNavId());
//            if((aboutmeNavObj.getDescription().get(1)!=null && !"".equals(aboutmeNavObj.getDescription().get(1))) || (aboutmeNavObj.getFileupload().get(1)!=null && !"".equals(aboutmeNavObj.getFileupload().get(1)))){
//                if(aboutmeNavObj.getDescription().get(1)!=null && !"".equals(aboutmeNavObj.getDescription().get(1))){
//                    aboutmeNav.setDescription(aboutmeNavObj.getDescription().get(1));
//                }
//                if(aboutmeNavObj.getFileupload().get(1)!=null && !"".equals(aboutmeNavObj.getFileupload().get(1))){
//                    aboutmeNav.setImgaeUrl(aboutmeNavObj.getFileupload().get(1));
//                }
//                aboutMeService.addAboutMeNav(aboutmeNav);
//            }
//        }
//        return PortfolioSaveUpdateResponseDto.builder().status(HttpStatus.OK.getReasonPhrase()).message("information successfully updated").build();
//    }
}
