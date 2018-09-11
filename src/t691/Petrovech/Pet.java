package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Pet {
    int petHealth = 5;
    Timer timer = new Timer();
    void addPetHealth(){
        ++petHealth;
    }
    void health() {
        System.out.print("Жiзнi -> ");
        for(int i = 0; i < petHealth; ++i){
            System.out.print("❤ ");
        }
        System.out.println("(" + petHealth + ")");
        if(petHealth <= 0) {
            System.out.println("Я помэр.");
            System.exit(0);
        }
    }
    void eat(){
        if(petHealth >= 8) {
        System.out.println("Я бiльше не могу бахатi борщ!!!");
        } else {
            System.out.println("Творiна хавае...");
            addPetHealth();
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){}
        health();
    }
    void game() {
        if(petHealth >= 8) {
            System.out.println("Я втомiвся, корiстувач вiдстань!");
        } else {
            System.out.println("Тварiна грае у гульню...");
            System.out.println("Їй дуже весело!");
            addPetHealth();
        }
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ex){}
        health();
    }
    void sleep(){
        if(petHealth >= 8){
            System.out.println("Творiна не бажае спатi!");
        } else {
            System.out.println("Творiна бегче поспатi!");
            System.out.println("Творiна спыть...");
            addPetHealth();
        }
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException ex){}
        health();
    }

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            --petHealth;
            health();
        }
    };
}
