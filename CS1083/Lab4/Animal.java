public class Animal
{
	String	species;
	int		age;
	
	public Animal()
	{
		species = "";
		age = 0;
	}
	
	public Animal(String s, int a)
	{
		species = s;
		age = a;
	}
	
	public String toString()
	{
		return "\nSpecies: " + species +
				 "\nAge: " + age;
	}
}