/**********************************************************************
Application: Lab4Test
	  Author: Steven Osborne
		 Date: February 2, 2011
Description: This program tests the inheritance hierarchy for lab 4.

	  Output: Various test results
**********************************************************************/

public class Lab4Test2
{
	public static void main(String[] args)
	{
		System.out.println("Lab 4 Test 2");
		Animal myAnimal = new Animal("Gorilla",23);
		System.out.println(myAnimal);
		DomesticAnimal farmAnimal = new DomesticAnimal(299.50,
				"Old MacDonald", "Drury Lane", "506-648-5901");
		System.out.println(farmAnimal);
		Pet myPet = new Pet("Rover");
		System.out.println(myPet);
	}
}