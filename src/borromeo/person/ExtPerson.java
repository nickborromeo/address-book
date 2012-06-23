package borromeo.person;
import borromeo.address.Address;
import borromeo.dates.Date;


public class ExtPerson
{
	private Person name;
	private Date bDay;
	private Address location;
	private int category;
	private String phoneNum;
	private String relation;
	
	public ExtPerson()
	{
		name = new Person();
 	    bDay = new Date();
 	    location = new Address();
 	    category = 0;
 	    phoneNum = "";
	}
	
	public ExtPerson(String first, String mid, String last, int month,int day, int year, 
					String st, String place, int zip,int categ, String pNum)
	{
		name = new Person(first,mid,last);
       	bDay = new Date(month,day,year);
       	location  =  new Address(st,place,zip);
       	category = categ;
       	phoneNum = pNum;
	}
	
	public void setExtPerson(String first, String mid, String last, int month,int day,int year, 
							String st, String place,int zip, int categ, String pNum)
   	{
	  	name.setName(first,mid,last);
        bDay.setDate(month,day,year);
	  	location.setAddress(st,place,zip);
	  	category = categ;
	  	phoneNum = pNum;
   	}
   	
   	public String toString()
   	{
   		if(category == 1)
   			relation = "Family Member";
   		else if(category == 2)
   			relation = "Friend";
   		else
   			relation = "Business Associate";
   		return (name.uppercase()+" - "+location.toString()+"\nPhone Number:  "+phoneNum
   				+"     BirthDay:  "+bDay.toString()+"\n"+relation+"\n");
   			
   	}
   	
   	public String getRelation()
   	{
   		return relation;
   	}
   	
   	public int getCategory() 
   	{
		return category;	
	}
	
	public String getPhoneNum()
	{
		return phoneNum;
	}
	
	public Person getName() 
	{
		return name;
	}
	 
	public Date getBday() 
	{
		return bDay;
	}
}//end - class

	
	
