/**********************************************************************
Application: Lab6Test
      Author: Steven Osborne
         Date: February 16, 2011
Description: This program tests the abstract methods for lab 6.

      Output: Various test results
**********************************************************************/

public class Lab6Test {
    public static void main(String[] args)
    {
        Animal[] farm = {new Cow(), new Horse(), new Pig()};

        System.out.println("Lab 6 Tests");
        for (int count = 0; count < farm.length; count++) {
            System.out.println(farm[count].species + " eats " +
                               farm[count].dailyFood() + " kgs of " + farm[count].eats());
        }
    }
}