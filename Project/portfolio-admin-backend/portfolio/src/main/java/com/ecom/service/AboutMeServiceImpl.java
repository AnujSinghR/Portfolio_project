package com.ecom.service;

import com.ecom.entity.AboutMeEntity;
import com.ecom.entity.AboutMeNavEntity;
import com.ecom.repository.AboutMeNavRepository;
import com.ecom.repository.AboutMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeServiceImpl implements AboutMeService{
    @Autowired
    private AboutMeRepository aboutMeRepository;
    @Autowired
    private AboutMeNavRepository aboutMeNavRepository;
    @Override
    public AboutMeEntity addAboutMeDetails(AboutMeEntity entity) {
        AboutMeEntity aboutMeId= aboutMeRepository.save(entity);
        return aboutMeId;
    }

    @Override
    public AboutMeNavEntity addAboutMeNav(AboutMeNavEntity entity) {
        AboutMeNavEntity aboutMeNavEntity = aboutMeNavRepository.save(entity);
        return aboutMeNavEntity;
    }
    @Override
    public List<AboutMeNavEntity> findAboutMeNav(Long aboutMeId) {
        return aboutMeNavRepository.finByAboutMeId(aboutMeId);
    }

    @Override
    public AboutMeNavEntity findAboutmeNav(Long aboutMeId, Long aboutMeNavId) {
        return aboutMeNavRepository.finByAboutMeNav(aboutMeId,aboutMeNavId);
    }

    @Override
    public AboutMeEntity findAboutMe(Long id){

        return aboutMeRepository.findByPortfolioUserId(id);
    }

    @Override
    public AboutMeEntity findAboutMeByPortfolioId(Long portfolioId) {
        return aboutMeRepository.findAboutMeByPortfolioId(portfolioId);
    }
}
