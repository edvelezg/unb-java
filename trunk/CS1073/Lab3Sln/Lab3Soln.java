/* Listing 2.10 page 48 in text
 * improved to only show non-zero denominations
 * displays single words (dollar, penny etc) where
 * appropriate
 */

import java.util.Scanner;

public class Lab3Soln{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();
    int remainingAmount = (int)(amount*100);

    //find the number of one dollars
    int numberOfOneDollars = remainingAmount/100;
    remainingAmount = remainingAmount %100;

    int numberOfQuarters = remainingAmount/25;
    remainingAmount = remainingAmount %25;

    int numberOfDimes = remainingAmount/10;
    remainingAmount = remainingAmount %10;

    int numberOfNickels = remainingAmount/5;
    remainingAmount = remainingAmount %5;

    int numberOfPennies = remainingAmount;

    String message = "Your amount " + amount + " consists of\n";
    if(numberOfOneDollars == 1)
      message = message + "\t1 dollar ";
    if(numberOfOneDollars >1)
      message = message + "\t"+numberOfOneDollars + " dollars ";
    if(numberOfQuarters == 1)
      message = message +"\t1 quarter ";
    if(numberOfQuarters > 1)
      message = message+ "\t"+numberOfQuarters + " quarters ";
    if(numberOfDimes ==1)
      message = message +"\t1 dime  ";
    if(numberOfDimes > 1)
      message = message + "\t" + numberOfDimes + "dimes  "; 
    if(numberOfNickels ==1)
      message = message + "\t1 nickel ";
    if(numberOfNickels>1)
      message = message  +"\t"+numberOfNickels + " nickels ";
    if(numberOfPennies ==1)
      message = message + "\t1 penny ";
    if(numberOfPennies > 1)
      message = message +"\t"+numberOfPennies + " pennies ";
    System.out.println(message);
  }
}

/*
Enter an amount in double, for example 11.56: 45.86
Your amount 45.86 consists of
        45 dollars      3 quarters      1 dime          1 penny

*/
