/**********************************************************************
Application: Lab7Test
	  Author: Steven Osborne
		 Date: February 20, 2011
Description: This program tests the implementations of the Cloneable
				 and Comparable interfaces for lab 7.

          Output: Various test results
 
Lab 7 Test
First animal is
Species: Leopard
Age: 5

Second animal is
Species: Gazelle
Age: 8

Third animal is
Species: Leopard
Age: 5

First animal is less than second animal
First and third animals are equal

Species: 
Age: 0
Value: 299.99
Name: Old MacDonald
Address: Drury Lane
Phone: 506-648-5901

Species: 
Age: 0
Value: 289.99
Name: Old MacDonald
Address: Drury Lane
Phone: 506-648-5901

Species: 
Age: 0
Value: 299.99
Name: Old MacDonald
Address: Drury Lane
Phone: 506-648-5901

First animal is greater than second animal
First and third animals are equal 
 
**********************************************************************/

public class Lab7Test
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("Lab 7 Test");
		Animal animalOne = new Animal("Leopard",5);
		System.out.println("First animal is" + animalOne + "\n");
		Animal animalTwo = new Animal("Gazelle",8);
		System.out.println("Second animal is" + animalTwo + "\n");
		Animal animalThree = (Animal)animalOne.clone();
		System.out.println("Third animal is" + animalThree + "\n");

		if (animalOne.compareTo(animalTwo) > 1)
			System.out.println("First animal is greater than second animal");
		else if (animalOne.compareTo(animalTwo) < -1)
			System.out.println("First animal is less than second animal");
		else
			System.out.println("First and second animals are equal");
		
		if (animalOne.compareTo(animalThree) > 1)
			System.out.println("First animal is greater than third animal");
		else if (animalOne.compareTo(animalThree) < -1)
			System.out.println("First animal is less than third animal");
		else
			System.out.println("First and third animals are equal");
		
		DomesticAnimal farmAnimalOne = new DomesticAnimal(299.99,
				"Old MacDonald", "Drury Lane", "506-648-5901");
		System.out.println(farmAnimalOne);
		
		DomesticAnimal farmAnimalTwo = new DomesticAnimal(289.99,
				"Old MacDonald", "Drury Lane", "506-648-5901");
		System.out.println(farmAnimalTwo);
		
		DomesticAnimal farmAnimalThree =
					(DomesticAnimal)farmAnimalOne.clone();
		System.out.println(farmAnimalThree + "\n");

		if (farmAnimalOne.compareTo(farmAnimalTwo) > 1)
			System.out.println("First animal is greater than second animal");
		else if (farmAnimalOne.compareTo(farmAnimalTwo) < -1)
			System.out.println("First animal is less than second animal");
		else
			System.out.println("First and second animals are equal");
		
		if (farmAnimalOne.compareTo(farmAnimalThree) > 1)
			System.out.println("First animal is greater than third animal");
		else if (farmAnimalOne.compareTo(farmAnimalThree) < -1)
			System.out.println("First animal is less than third animal");
		else
			System.out.println("First and third animals are equal");
	}
}