import java.util.Scanner;

public class Lab4Sample{

  public static void main(String[] args){

    int number = 10;

    for(int i = 0; i < number; ++i) {
      if (i % 2 == 0) 
      {
        System.out.println(i + " is even.");
      }
      else
      {
        System.out.println(i + " is odd.");
      }
    }

  }
}

