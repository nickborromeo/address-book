//Nicholas Borromeo
//The Address Book

package borromeo.main;
import java.io.*;

import borromeo.address.AddressBook;
import borromeo.person.ExtPerson;

public class InteractiveAddressBook {
	public static void main (String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	
		AddressBook list = new AddressBook();
		char choice = '*'; 
	
	    do {
		 
		String input;
		
		
		System.out.println("\n\n**************Main Menu**************");
		System.out.println("A - Add an entry to your Address Book ");
		System.out.println("R - Remove an entry from your Address Book ");
		System.out.println("S - Show all entries in your Address Book");
		System.out.println("Q - Quit the Program \n");
		
		System.out.print("Your choice : ");
		input = stdin.readLine().toUpperCase();
		choice = input.charAt(0);
			
		switch (choice)  {
			
			case 'A' : addToList(list);
					   break;
			
			case 'R' :  System.out.print("\nPlease enter lastname of entry to be searched: ");
						String searchName = stdin.readLine();
						removeFromList(list,searchName);		
				      	break;
			
			case 'S' : list.display(); 
					   break;
						
			case 'Q' : System.out.println("\nShutting Down Electronic Address Book..."); 
					   System.exit(0);
					   break;
			
			default : System.out.println("Wrong choice!");
			
		}
				
		} while (choice !='Q');
		
				
		
	
	} //end-main
		
	
	public static void addToList(AddressBook list) throws IOException {
		
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		
			System.out.println("\n----NAME----\n");	
			
			System.out.print("Lastname: " );
			String last = stdin.readLine();
			
			System.out.print("Middlename: " );
			String mid = stdin.readLine();
			
			System.out.print("Firstname: " );
			String first = stdin.readLine();
		
			System.out.print("Category: " );
			int category = Integer.parseInt(stdin.readLine());
			
			System.out.println("\n----ADDRESS----\n");	
			
			System.out.print("Street: ");
			String street = stdin.readLine();
			System.out.print("City: ");	 
			String city = stdin.readLine();	
			System.out.print("Zip Code: "); 
			int zip = Integer.parseInt(stdin.readLine().trim());
			
			System.out.println("\n----PHONE NUMBER----\n");
			
			System.out.print("Number: ");
			String phoneNum = stdin.readLine();
			
			System.out.println("\n----BIRTHDAY----\n");
			
			System.out.print("Month: ");
			int month = Integer.parseInt(stdin.readLine().trim());
			System.out.print("Day: ");
			int day = Integer.parseInt(stdin.readLine().trim());
			System.out.print("Year: ");
			int year = Integer.parseInt(stdin.readLine().trim());
				 
           	ExtPerson entry = new ExtPerson(first,mid,last,month,day,year,street,city,
           									zip,category,phoneNum);

            list.addElement(entry);
	}
	
	public static void removeFromList(AddressBook list, String searchName){
		
		for(int i=0; i<list.size(); i++){
			ExtPerson lastName = (ExtPerson)list.elementAt(i);
			int pos = list.search(searchName);
		
			if(pos == -1)
				System.out.println("\nContact with the name "+searchName+
									" is not in your Address Book.");
			else if(searchName.equals(lastName.getName().getLastName().toString())){
				list.removeElementAt(pos);
				removeFromList(list,searchName);
				System.out.println("\n Contact with the name "+searchName+
									" has been removed from your Address Book.");
				}
			
			
		}//end for
		
	}//end removeFromList
	
}//end-class
	
	
