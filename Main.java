package com.itsmemonzu;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Player & Computer Input

        String[] rps = {"Rock", "Paper", "Scissors"};

        String computer = rps[new Random().nextInt(rps.length)];

        System.out.println("Choose Rock, Paper or Scissors!");
        Scanner playerrps = new Scanner(System.in);
        String player = playerrps.nextLine();


        // Rock

        if(computer.equals("Rock") && player.equals("Paper")){
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("You won!");
        }if(computer.equals("Rock") && player.equals("Scissors")){
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("You lost!");
        }if(computer.equals("Rock") && player.equals("Rock")) {
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("That was a draw!");
        }

        // Paper
        if(computer.equals("Paper") && player.equals("Rock")){
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("You lost!");
        }if(computer.equals("Paper") && player.equals("Scissors")) {
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("You won!");
        }if(computer.equals("Paper") && player.equals("Paper")){
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("That was a draw!");
        }

        // Scissors
        if(computer.equals("Scissors") && player.equals("Paper")){
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("You lost!");
        }if(computer.equals("Scissors") && player.equals("Rock")) {
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("You won!");
        }if(computer.equals("Scissors") && player.equals("Scissors")) {
            System.out.println("Opponent chose " + computer + "!");
            System.out.println("That was a draw!");
        }else{
            System.out.println("Please write the first letter in Caps!");
        }
    }
}
