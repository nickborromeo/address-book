package borromeo.person;
public class Person
{
    private String firstName; //store the first name
    private String lastName;  //store the last name
    private String midName; //store the middle name
        //Default constructor
        //Initialize firstName and lastName to an empty string.
        //Postcondition: firstName = ""; lastName = "";
    
    public Person()
    {
        firstName = "";
        lastName = "";
        midName ="";

    }

	    //Constructor with parameters
        //Set firstName and lastName according to the parameters.
        //Postcondition: firstName = first; lastName = last;
    public Person(String first, String mid, String last)
    {
        setName(first, mid, last);
    }

		//copy constructor
	public Person(Person other)
    {
        firstName = other.firstName;
        lastName = other.lastName;
        midName =other.midName;

    }
    
        //Method to output the first name and last name
        //in the form firstName lastName.
    public String toString()
    {
        return (lastName + ", " + firstName + " " + midName);
    }

        //Method to set firstName and lastName according to
        //the parameters.
        //Postcondition: firstName = first; lastName = last;
    public void setName(String first, String mid, String last)
    {
        firstName = first;
        lastName = last;
        midName = mid;
    }

        //Method to return firstName.
        //Postcondition: The value of firstName is returned.
    public String getFirstName()
    {
        return firstName;
    }

        //Method to return lastName.
        //Postcondition: The value of lastName is returned.
    public String getLastName()
    {
        return lastName;
    }

    public String getMidName()
    {
        return midName;
    }
    
    public boolean equals(Person other) {
    	return (firstName.equals(other.firstName) &&
    			lastName.equals(other.lastName));
    }
    
    public Person uppercase() {
    	
    	Person temp = new Person();
    	
    	temp.firstName = firstName.toUpperCase();
    	temp.midName = midName.toUpperCase();
    	temp.lastName = lastName.toUpperCase();
    	
    	return temp;
    	
    }
}
