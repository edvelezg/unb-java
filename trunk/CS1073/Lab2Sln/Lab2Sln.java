import javax.swing.*;
import java.util.Scanner;

public class Lab2Sln {

    public static void main(String args[]) {
        /**
         * Question 1. This is through the shell
         */
        Scanner keyboard = new java.util.Scanner(System.in);
        
        System.out.println("Enter a number between 0 and 1000");
        int number = keyboard.nextInt();

        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number % 10;

        int sum = digit1 + digit2 + digit3;

        System.out.println("The sum of digits is " + sum);


        /**
         * Question 2. This is through a GUI
         */

        String message = "Enter a number between 0 and 1000";
        String title = "Sums digits of an integer";
        String numberStr = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);

        number = Integer.parseInt(numberStr);
        digit1 = number % 10;
        number = number / 10;
        digit2 = number % 10;
        number = number / 10;
        digit3 = number % 10;

        sum = digit1 + digit2 + digit3;
        String resultMessage = "The sum of the digits is " + sum;
        JOptionPane.showMessageDialog(null, resultMessage, title, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
