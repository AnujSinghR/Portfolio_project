package com.ecom.repository;

import com.ecom.entity.EducationDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationDetailRepository extends JpaRepository<EducationDetailEntity,Long> {
    @Query("Select educationDetailEntity from EducationDetailEntity educationDetailEntity where educationId=:educationId")
    List<EducationDetailEntity> findByEducationId(Long educationId);
    @Query("Select educationDetailEntity from EducationDetailEntity educationDetailEntity where educationId=:educationId and educationDetailId=:educationDetailId")
    EducationDetailEntity findByEducationDetailsId(Long educationId, Long educationDetailId);
}
