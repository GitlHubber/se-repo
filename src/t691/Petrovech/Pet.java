package com.company;

public class Pet {
    static int petHealth = 5;
    static void addPetHealth(){
        ++petHealth;
    }
    static void health() {
        System.out.print("Жiзнi -> ");
        for(int i = 0; i < petHealth; ++i){
            System.out.print("❤ ");
        }
        System.out.println();
        if(petHealth <= 0) {
            System.out.println("Я помэр.");
        }
    }
    static void eat(){
        addPetHealth();
        if(petHealth > 10) {
            System.out.println("Я бiльше не могу бахатi борщ!!!");
            petHealth = 10;
        }
        health();
    }
    static void game() {
        addPetHealth();
        if(petHealth > 10) {
            System.out.println("Я втомiвся, корiстувач вiдстань!");
            petHealth = 10;
        }
        System.out.println("Тварiна грае у гульню. Їй дуже весело!");
        health();
    }
    static void sleep(){

    }
}
