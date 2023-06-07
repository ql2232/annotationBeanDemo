package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Football implements Coach{
    @Override
    public String getDailyWorkOutSchedule() {
        return "Football schedule: Everyday->watch NFL";
    }
}
