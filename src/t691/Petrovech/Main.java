package com.company;

import java.util.*;

import static com.company.Pet.*;

public class Main {

    public static void main(String[] args) {
    System.out.println("Дiвiться цэ тумагоччi.");
    Pet.health();
    Date date = new Date();
    while(petHealth > 0){
        System.out.println("Натiснiть 1 щоб покормiтi тварiрну.");
        System.out.println("Бо 2 каб поiгратi з тварiною.");
        Scanner scan = new Scanner(System.in);
        int press = scan.nextInt();
        if((date.getTime() % 10000) / 1000 == 5){
            --petHealth;
            health();
        }
        if(press == 1){
            eat();
        } else if(press == 2){
            game();
        } else {
            System.out.println("Корiстувач ты дэбiл!");
            health();
        }
    }
    }
}
