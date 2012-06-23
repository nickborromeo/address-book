package borromeo.address;

public class Address
{
	
	private String street;
	private String city;
	private int zipCode;
	
	public Address()
	{
		street = "";
		city = "";
		zipCode = 0;
	}
	
	public Address(String st, String place, int zip)
	{
		setAddress(st,place,zip);
	}
	
	public void setAddress(String st, String place, int zip)
	{
		street = st;
		city = place;
		zipCode = zip;
	}
	
	public String toString()
	{
		return (street +", "+ city+" "+zipCode);
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int getZipCode()
	{
		return zipCode;
	}
	
	

}//end - class

	
	
