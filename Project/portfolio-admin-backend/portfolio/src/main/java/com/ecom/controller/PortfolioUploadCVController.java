package com.ecom.controller;

import com.ecom.entity.UploadFileEntity;
import com.ecom.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/")
public class PortfolioUploadCVController {

    @Autowired
    private UploadFileService uploadFileService;
     private static final String UPLOAD_FOLDER = "src/main/files/";

    @PostMapping("uploadCv")
    @CrossOrigin(origins = "http://localhost:4200")
    public String uploadFile(@RequestParam("file") MultipartFile file,@RequestParam("email") String email,
                             @RequestParam("portfolioId") String portfolioId) {
        try {
            byte[] bytes = file.getBytes();
            String[] parts = email.split("@");
            Path path = Paths.get(UPLOAD_FOLDER + parts[0]);
            Files.write(path, bytes);
            uploadFileService.addFileUpload(UploadFileEntity.builder().portfolioId(Long.valueOf(portfolioId)).fileName(parts[0]).filePath(UPLOAD_FOLDER).build());
            return "File uploaded successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error uploading file";
        }
    }
}
