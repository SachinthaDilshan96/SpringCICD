package com.cicd.demo.dto;

public class ResponseDto {
    private int responseNumber;

    public int getResponseNumber() {
        return responseNumber;
    }

    public void setResponseNumber(int responseNumber) {
        this.responseNumber = responseNumber;
    }

    public ResponseDto(int responseNumber) {
        this.responseNumber = responseNumber;
    }
}
