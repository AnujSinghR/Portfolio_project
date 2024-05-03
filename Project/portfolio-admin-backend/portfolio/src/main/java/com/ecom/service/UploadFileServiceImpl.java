package com.ecom.service;

import com.ecom.entity.UploadFileEntity;
import com.ecom.repository.UploadFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadFileServiceImpl implements UploadFileService{

    @Autowired
    private UploadFileRepository uploadFileRepository;

    @Override
    public UploadFileEntity addFileUpload(UploadFileEntity uploadFileEntity) {
        return uploadFileRepository.save(uploadFileEntity);
    }
}
