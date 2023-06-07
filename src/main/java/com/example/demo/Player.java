package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Player {

    Coach tennisCoach;
    Coach golfCoach;

    @Autowired
    @Qualifier("football")
    Coach footballCoach;

    @Autowired
    public Player(Tennis tennisCoach){
        this.tennisCoach = tennisCoach;
    }

    @Autowired
    public void setGolfCoach(Golf golfCoach){
        this.golfCoach = golfCoach;
    }

}
