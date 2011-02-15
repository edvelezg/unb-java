/**********************************************************************
Application: AddIntegersInFile
      Author: Steven Osborne
         Date: February 7, 2011
Description: This program reads the integers from a file (skipping 
                 things that are not integers) and displays the total of
                 the elements and the average of the elements.

      Output: Total and average of the integer elements.
                 Various other exception based messages.
**********************************************************************/
import java.io.*;       // For File class and some exceptions
import java.util.*; // For Scanner class and some exceptions

public class AddIntegersInFile {
    public static void main(String[] args)
    {
        // Start with the count of the integers and the total at zero.
        int total = 0;
        int countIntegers = 0;      

        // This try block will try to open the file and read it.
        // FileNotFoundException will detect if the file cannot be found.
        // NoSuchElementException will detect when the end of the file
        //		has been encountered.		
        try {

            // Open the file that will be read from		
            Scanner inputFile = new Scanner(new File("input.txt"));

            // This while can be infinite because it will be exited when
            // a NoSuchElementException (end of the file) has been
            // encountered.
            while (true) {
                // Try to read an integer and add it to the total
                try {
                    total += inputFile.nextInt();
                    countIntegers++;
                }

                // Catch any non-integer input and use the next()
                // mthod to skip over the non-integer token.
                catch (InputMismatchException ex) {
                    String garbage = inputFile.next();
                    System.out.println("Skipping a non-integer");
                }

                // If we get this far then the nextInt() method
                // worked and the count if the integers can be
                // increased.
            }
        }

        // If the file is not found we can use the message from
        // the toString() method for the exception object.
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        catch (NoSuchElementException ex) {
            System.out.println("End of the file has been encountered");
        }
        // If this exception occurs then we have hit the end of
        // the input file.

        // Display the total and average of the integers.
        System.out.println("Total is " + total + "\nAverage is " +
                           total/(double)countIntegers);
    }
}