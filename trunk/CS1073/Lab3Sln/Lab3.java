import java.util.Scanner;

public class Lab3 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        float number = input.nextFloat();

        System.out.println("You entered: " + number);

        if (number > 10) {
            System.out.println("is greater than 10");
        }
        else
        {
            System.out.println("is lesser than 10");
        }

    }
}
