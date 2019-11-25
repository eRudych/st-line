package com.example.stline.controller;

import com.example.stline.dto.BaseDTO;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.FileList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"/drive"})
@Slf4j
public class DriveController {

    private static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    @Value("${google.service.account.key}")
    private Resource serviceAccountKey;


    @GetMapping(value = { "/servicelistfiles" }, produces = { "application/json" })
    public @ResponseBody
    List<BaseDTO> listFilesInServiceAccount() throws Exception {
        log.info("serrrrrrrrrrrrrrrrrver");
        Credential cred = GoogleCredential.fromStream(serviceAccountKey.getInputStream());

        GoogleClientRequestInitializer keyInitializer = new CommonGoogleClientRequestInitializer();

        Drive drive = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, null).setHttpRequestInitializer(cred)
                .setGoogleClientRequestInitializer(keyInitializer).build();

        List<BaseDTO> responseList = new ArrayList<>();

        FileList fileList = drive.files().list().setFields("files(id,name,thumbnailLink)").execute();
//        for (File file : fileList.getFiles()) {
//            BaseDTO item = new FileItemDTO();
//            item.setId(file.getId());
//            item.setName(file.getName());
//            item.setThumbnailLink(file.getThumbnailLink());
//            responseList.add(item);
//        }

        return responseList;
    }

    //https://developers.google.com/drive/api/v3/push
}
