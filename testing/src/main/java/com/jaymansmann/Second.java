package com.jaymansmann;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Second 
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        String answer = getInput("Who was the first president of the USA?", scanner);
        int score = 0;
        if(answer.equals("Washington")) {
            score++;
        }
        System.out.println("Congratulations, " + name + ". Your score is " + score + ".");
        scanner.close();
    }

    private static String getInput(String prompt, Scanner scanner) {
        String input = null;
        do{ 
            System.out.println(prompt);
            input = scanner.nextLine();
        }
        while(input == null || input.isBlank());
        return input;
        
    }
}
