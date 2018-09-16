package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    System.out.println("Дiвiться цэ тумагоччi.");
    System.out.println("Натiснiть 0 щоб творiна померла.");
    Pet gatchi = new Pet();
    gatchi.health();
    Date date = new Date();
    gatchi.timer.scheduleAtFixedRate(gatchi.task, 1000, 10000);
    for(;;){
        System.out.println("Натiснiть 1 щоб покормiтi тварiрну.");
        System.out.println("Бо 2, каб поiгратi з тварiною.");
        System.out.println("Чi троiчку, каб поспатi.");
        Scanner scan = new Scanner(System.in);
        int press = scan.nextInt();

        switch (press){
            case 0 : System.out.println("Я зробiв суiцiд.");
                System.exit(0); break;
            case 1 : gatchi.eat(); break;
            case 2 : gatchi.game(); break;
            case 3 : gatchi.sleep(); break;
            default : System.out.println("Корiстувач ты дэбiл!");
                gatchi.health(); break;
        }
    }
    }
}
