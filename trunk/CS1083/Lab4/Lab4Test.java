/**********************************************************************
Application: Lab4Test
	  Author: Steven Osborne
		 Date: February 2, 2011
Description: This program tests the inheritance hierarchy for lab 4.

	  Output: Various test results
**********************************************************************/

public class Lab4Test
{
	public static void main(String[] args)
	{
		System.out.println("Lab 4 Tests");
		Animal myAnimal = new Animal();
		System.out.println(myAnimal);
		DomesticAnimal farmAnimal = new DomesticAnimal();
		System.out.println(farmAnimal);
		Pet myPet = new Pet();
		System.out.println(myPet);
	}
}

