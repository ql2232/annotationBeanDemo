package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Player player = context.getBean(Player.class);

        System.out.println(player.tennisCoach.getDailyWorkOutSchedule());
        System.out.println(player.golfCoach.getDailyWorkOutSchedule());
        System.out.println(player.footballCoach.getDailyWorkOutSchedule());
    }
}
