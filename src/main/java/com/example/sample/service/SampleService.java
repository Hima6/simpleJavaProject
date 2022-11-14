package com.example.sample.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String getMessage(){
        String s= null;
        if(s == null){
        s =  "Message from service layer"; 
        }
        return s;       
    }
}
