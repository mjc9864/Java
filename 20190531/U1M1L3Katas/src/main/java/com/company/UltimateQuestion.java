package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int userInt;

        do {
            System.out.println("pick a number from 1 - 100");
            userInput = myScanner.nextLine();
            userInt = Integer.parseInt(userInput);
        } while(userInt != 42);

        if (userInt == 42) {
            System.out.println("That's the number I was looking for! 42 is definitely the answer!");
        }


    }
}


