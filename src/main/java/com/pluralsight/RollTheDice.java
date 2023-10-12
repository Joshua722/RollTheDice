package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = 0;
        int roll2 = 0;
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll1;

            if (sum == 2) {
                count2++;

            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }
            System.out.println("Here is the Dice Number and its roll " + i + " : " + roll1 + " / " + roll2 + " = " + sum);


        }
        System.out.println("Here are the times it landed on two : " + count2);
        System.out.println("Here are the times it landed on four : " + count4);
        System.out.println("Here are the times it landed on six : " + count6);
        System.out.println("Here are the times it landed on seven : " + count7);


    }
}