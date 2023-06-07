package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Golf implements Coach{
    @Override
    public String getDailyWorkOutSchedule() {
        return "Golf schedule: Everyday->play golf and meditate";
    }
}
