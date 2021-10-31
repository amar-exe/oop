package com.company;
import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Dice dice = new Dice(7);

        int i = 0;
        while(i<10){
            System.out.println(dice.roll());
            i++;
        }

    }


}
