package com.cicd.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    private int count= 0;

    public int getCount(){
        count++;
        return count;
    }
}
