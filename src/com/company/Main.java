package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();
        if (answer.equals("rain"));
            System.out.println("Take your umbrella!");
        /*else if (answer == "windy")
            System.out.println("Wear your jacket!");
        else if (answer == "snow")
            System.out.println("Wear a coat and take a shovel!");
        else if (answer == "stormy")
            System.out.println("You should stay inside!");
            */
        else
            System.out.println("Enjoy your day!");
    }

}