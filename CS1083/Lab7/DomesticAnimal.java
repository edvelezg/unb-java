public class DomesticAnimal extends Animal implements Cloneable, Comparable
{
	double	value;
	Owner		thisOwner;

	public DomesticAnimal()
	{
		value = 0.0;
		thisOwner = new Owner();
	}

	public DomesticAnimal(double v, String n, String a, String p)
	{
		value = v;
		thisOwner = new Owner(n, a, p);
	}
	
	public String toString()
	{
		return super.toString() +
				 "\nValue: " + value +
				 thisOwner.toString();
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public int compareTo(Object passed)
	{
		return (int)(value - ((DomesticAnimal)passed).value);
	}

}