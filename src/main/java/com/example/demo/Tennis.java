package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files;

@Component
public class Tennis implements Coach{

    private List<String> schedules;
    private Random random = new Random();

    @PostConstruct
    public void loadSchedule(){
        try{
            schedules = Files.readAllLines(Paths.get("src/main/java/com/example/demo/tennisSchedule"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public String getDailyWorkOutSchedule() {
        return "Tennis schedule: " + this.schedules.get(random.nextInt(schedules.size()));
    }
}
