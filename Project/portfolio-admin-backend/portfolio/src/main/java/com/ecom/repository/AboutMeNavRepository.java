package com.ecom.repository;

import com.ecom.entity.AboutMeNavEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AboutMeNavRepository extends JpaRepository<AboutMeNavEntity,Long> {
    @Query("select aboutMeNavEntity from AboutMeNavEntity aboutMeNavEntity where aboutMeId=:aboutMeId")
    List<AboutMeNavEntity> finByAboutMeId(Long aboutMeId);
    @Query("select aboutMeNavEntity from AboutMeNavEntity aboutMeNavEntity where aboutMeId=:aboutMeId and id=:aboutMeNavId")
    AboutMeNavEntity finByAboutMeNav(Long aboutMeId,Long aboutMeNavId );
}
