/*
  Lab5Soln.java
  Solution to lab 5 Winter 2011
  Decomposed lab 2 into 3 methods
  getUserInput: Prompts for a value between 0 and 1000 with  error checking
  addDigits: returns the sum of the digits of an integer provided in parameters
  main: allows the user to run the application multiple times
  written by Hazel Webb
  March 1 2011
 
*/

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab5Soln
{
    public static void main(String[]args)
    {

        Scanner keyboard = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain)
        {
            int number = getUserInput();

            System.out.println("The sum of the digits is " + addDigits(number));

            System.out.println("Play again? y/n");
            String play = keyboard.nextLine();

            if (!play.equals("y"))
                playAgain = false;
        }

    }
    public static int getUserInput()
    {
        Scanner keyboard = new Scanner(System.in);
        int number = -1;
        while (number < 0 || number > 999)
        {
            System.out.println("Enter a number between 0 and 1000");
            number = keyboard.nextInt();
        }
        return number;
    }

    public static int addDigits(int number)
    {
        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number % 10;


        int sum = digit1 + digit2 + digit3;

        return sum;
    }



}