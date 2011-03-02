public class Animal implements Cloneable, Comparable
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
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public int compareTo(Object passed)
	{
		return age - ((Animal)passed).age;
	}
}