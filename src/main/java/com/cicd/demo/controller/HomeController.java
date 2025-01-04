package com.cicd.demo.controller;

import com.cicd.demo.dto.ResponseDto;
import com.cicd.demo.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/counts")
    public ResponseEntity<ResponseDto> getCount(){
        ResponseDto response = new ResponseDto(homeService.getCount());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
