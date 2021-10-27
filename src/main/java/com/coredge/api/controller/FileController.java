package com.coredge.api.controller;

import com.coredge.api.service.FileService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author rohit
 * @Date 27/10/21
 **/
@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping
    public ResponseEntity<?> all() throws JSONException {
        return new ResponseEntity<>(fileService.fetchAllHospital(), HttpStatus.OK);
    }

    @GetMapping("{statusCode}")
    public ResponseEntity<?> statusCode(@PathVariable String statusCode) throws JSONException {
        return new ResponseEntity<>(fileService.getHospitalByCode(statusCode), HttpStatus.OK);
    }

    @GetMapping("state/{statusName}/{hsoname}")
    public ResponseEntity<?> nameAndHospitalCode(@PathVariable String statusName, @PathVariable String hsoname) throws JSONException {
        return new ResponseEntity<>(fileService.getHospitalByNameAndState(statusName, hsoname), HttpStatus.OK);
    }

    @GetMapping("type/{type}")
    public ResponseEntity<?> type(@PathVariable String type) throws JSONException {
        return new ResponseEntity<>(fileService.getHospitalByType(type), HttpStatus.OK);
    }
}
