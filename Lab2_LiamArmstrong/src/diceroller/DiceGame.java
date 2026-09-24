package diceroller;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int dice1;
        int dice2;
        int dice3;
        int dice4;
        int total;
        int goalNumber;

        System.out.println("Welcome to the Dice Game!");
        System.out.println("Press Enter to roll four dice.");
        input.nextLine();

        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;
        dice3 = random.nextInt(6) + 1;
        dice4 = random.nextInt(6) + 1;

        total = dice1 + dice2 + dice3 + dice4;
        System.out.println("You rolled: " + dice1 + ", " + dice2 + ", "
                + dice3 + ", " + dice4);
        System.out.println("Your total is: " + total);

        if (total == 7 || total == 11 || total == 15 || total == 21) {
            System.out.println("You win!");
        } 
        else if (total == 10 || total == 12 || total == 13
                || total == 19 || total == 20 || total == 22
                || total == 23 || total == 24) {
            System.out.println("You lose!");
        } 
        else {
            goalNumber = total;

            System.out.println("Your goal number is " + goalNumber);
            System.out.println("Press Enter to roll again.");

            while (true) {
                input.nextLine();

                dice1 = random.nextInt(6) + 1;
                dice2 = random.nextInt(6) + 1;
                dice3 = random.nextInt(6) + 1;
                dice4 = random.nextInt(6) + 1;

                total = dice1 + dice2 + dice3 + dice4;

                System.out.println("You rolled: " + dice1 + ", " + dice2 + ", "
                        + dice3 + ", " + dice4);
                System.out.println("Your total is: " + total);

                if (total == 13) {
                    System.out.println("You rolled 13. You lose!");
                    break;
                } 
                else if (total == goalNumber) {
                    System.out.println("You rolled your goal number. You win!");
                    break;
                } 
                else {
                    System.out.println("Try again.");
                    System.out.println("Press Enter to roll again.");
                }
            }
        }

        input.close();
    }
}