/**
   Class ArrayExamples demonstrates creating
   and iterating over single dimension arrays.
   We create a list of 20 random integers on the
   range 0-500.  
   Find the max, min and average of
   the list.
   We sort the list using linear sort
   
   March 14, 2011
**/


import java.util.Random;
import java.util.Scanner;


public class Lab6Soln
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How large is your array?");
        int size = keyboard.nextInt();

        System.out.println("What is the maximum value in the range?");
        int range = keyboard.nextInt();

        //generate an array of size 20 of random integers on the range 0-500

        int[] nums = new int[size];// declare array of ints size 20

        Random ran = new Random();// create a Random object


        for (int i = 0; i< nums.length; ++i)
            nums[i] = ran.nextInt(range);//use the Random class method nextInt(n)


        System.out.println("\n********************* unsorted list ***************");

        //display nums
        for (int i =0; i < nums.length; ++i)
            System.out.print(nums[i] + " ");

        System.out.println("\n\nMax is: " + max(nums));
        System.out.println("\nMin is: " + min(nums));
        System.out.println("\nAverage is: "+ average(nums));
        int[] sortedNums = linearSort(nums, range);
        System.out.println("\n************* sorted list *********************");
        //display nums
        for (int i =0; i < sortedNums.length; ++i)
            if (sortedNums[i] != -1)// display the numbers in the sorted list (without duplicates)
                System.out.print(sortedNums[i] + " ");


        System.out.println();//wrap cursor neatly

    }//end main





    public static int max(int[] nums)
    {
        //find max in nums using a regular FOR loop
        int max = -1;
        for (int i = 0; i < nums.length; ++i)
        {
            if ( nums[i] > max)
                max = nums[i];
        }
        return max;
    }



    public static int min(int[] nums)
    {

        //find min in nums using a FOREACH loop
        int min = 501;
        for (int n: nums)
        {
            if (n < min)
                min = n;
        }
        return min;
    }

    public static double average(int[] nums)
    {


        //find average in nums
        int total = 0;
        for (int n: nums)
        {
            total = total + n;
        }

        return(double)total/nums.length;
    }

    public static int[] linearSort(int[] nums, int range)
    {

        //sort nums using linear sorting

        int[]sortingList = new int[range];
        //our values range from 0-range inclusive so create an array of that size

        for (int i =0; i < sortingList.length; ++i)
            sortingList[i] = -1;
        //initialize every element to -1

        int[] sortedNums = new int[nums.length];
        //to store the list after sorting
        //initialize to -1 --our sorted list may be shorter than 20 values
        for (int i = 0; i < sortedNums.length; ++i)
            sortedNums[i] = -1;

        for (int i = 0; i < nums.length; ++i)
            sortingList[nums[i]] = 1;//when we see a number update the guy at that position in sortingList
        //for example, nums[0] is 5, so set sortingList[5] to 1

        //sorting step	
        int index = 0;  
        // for(int n: sortingList)WE CANNOT USE A FOREACH LOOP HERE

        for (int i = 0; i < sortingList.length; ++i)
            if (sortingList[i] == 1)//if we have seen this i value then sortingList[i] will be a one (-1 otherwise)
            {
                sortedNums[index] = i;
                index++;
            }
        return sortedNums;
    }

}
