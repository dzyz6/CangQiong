package com.example.demo4.enity;

import lombok.Data;

@Data
public class Answer <T>{
    private int code;
    private String message;
    private T data;
}
