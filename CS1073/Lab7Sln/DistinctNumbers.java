import java.util.Scanner;

public class DistinctNumbers{

  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    
   
    System.out.println("Please enter 10 numbers");
    //code here to read and store 10 numbers
    final int SIZE = 10;
    int[] numbers = new int[SIZE];
    for(int i = 0; i < SIZE; ++i)
      numbers[i] = keyboard.nextInt();


    System.out.println("You entered: ");
    //code here to display the numbers as entered
    for(int n: numbers)
      System.out.print(n +" ");
    System.out.println();


    System.out.println("In reverse: ");
    //code here to display the numbers in reverse
    for(int i = SIZE -1; i >=0; i--)
      System.out.print(numbers[i] +" ");
    System.out.println();




    System.out.println("The distinct numbers: " );
    //code here to display the distinct numbers
    int counter = 0;
    boolean unique = true;
    int[] distinct = new int[SIZE];
    for(int i = 0; i < SIZE; ++i){
      unique = true;
      for(int j = 0; j <= counter; j++)
	if(numbers[i] == distinct[j])
	  unique = false;
      if(unique){
	distinct[counter] = numbers[i];
	counter++;
      }
      
    }

    for(int i = 0; i < counter; ++i)
      System.out.println(distinct[i] +  " ");
    System.out.println();


  }
}