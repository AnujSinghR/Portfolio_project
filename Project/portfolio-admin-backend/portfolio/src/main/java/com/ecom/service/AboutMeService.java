package com.ecom.service;

import com.ecom.entity.AboutMeEntity;
import com.ecom.entity.AboutMeNavEntity;

import java.util.List;


public interface AboutMeService {
    AboutMeEntity addAboutMeDetails(AboutMeEntity entity);
    AboutMeNavEntity addAboutMeNav(AboutMeNavEntity entity);

    List<AboutMeNavEntity> findAboutMeNav(Long aboutMeId);

    AboutMeNavEntity findAboutmeNav(Long aboutMeId,Long aboutMeNavId);
    AboutMeEntity findAboutMe(Long id);

    AboutMeEntity findAboutMeByPortfolioId(Long portfolioId);
}
