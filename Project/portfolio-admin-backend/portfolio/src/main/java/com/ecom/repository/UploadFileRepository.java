package com.ecom.repository;

import com.ecom.entity.UploadFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadFileRepository extends JpaRepository<UploadFileEntity,Long> {
}
