package com.company;

import java.util.Random;

public class ShorterDoubleDice {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("HERE COMES THE DICE!");

        int rollDice1 = random.nextInt(6)+1;
        int rollDice2 = random.nextInt(6)+1;
        int total = rollDice1 + rollDice2;

        do {rollDice1 = random.nextInt(6)+1;
            rollDice2 = random.nextInt(6)+1;
            System.out.println("Roll #1: " + rollDice1);
            System.out.println("Roll #2: " + rollDice2);
            System.out.println("The total is " + total + "!");
        }

        while(rollDice1!=rollDice2);



    }
}

