import java.util.Scanner;

/* Solution to Lab 4 Winter 2011
   Program approximates pi by summing an infinite series
   
   written by Hazel Webb
   February 11, 2011
*/

public class Lab4Soln{

  public static void main(String[] args){

    int counter = 0;
    double pi = 0;
    double denominator = 1;

    System.out.println("Enter the number of terms you want me to include");

    Scanner keyboard = new Scanner(System.in);

    int n = keyboard.nextInt();

    while(counter < n){
      if(counter % 2 == 0)
          pi = pi + 1/denominator;
      else
          pi = pi - 1/denominator;
      counter++;
      denominator += 2;
    }
    pi = pi * 4;
    System.out.println("Your value for pi was: " + pi);
  }
}