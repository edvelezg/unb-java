public class Pet extends DomesticAnimal
{
	String	name;

	public Pet()
	{
		name = "";
	}

	public Pet(String n)
	{
		name = n;
	}
	
	public String toString()
	{
		return super.toString() +
				 "\nName: " + name;
	}
}