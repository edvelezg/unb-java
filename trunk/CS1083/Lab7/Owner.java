public class Owner
{
	String name;
	String address;
	String phone;

	public Owner()
	{
		name = "";
		address = "";
		phone = "";
	}
	
	public Owner(String n, String a, String p)
	{
		name = n;
		address = a;
		phone = p;
	}

	public String toString()
	{
		return "\nName: " + name +
				 "\nAddress: " + address +
				 "\nPhone: " + phone;
	}
}