package borromeo.address;


import java.util.*;
import java.io.*;

import borromeo.person.ExtPerson;

public class AddressBook extends Vector {
	
	public AddressBook() 
	{
		super();			
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("\nYour Address Book is EMPTY!");
		else
        	for(int i=0; i<size(); i++) 
				System.out.println((ExtPerson)elementAt(i));
 		
    } //end-display
    
    public int search(String searchName){
	  
		for(int i=0; i<size(); i++){
			ExtPerson lastName = (ExtPerson)elementAt(i);
			if(searchName.equals(lastName.getName().getLastName().toString()))
				return i;
		}//end for
			
		return -1;
	}//end search
	
	public void sort() 
	{
		int j;
	
		for(int i=1; i<size(); i++){
		
			ExtPerson temp = (ExtPerson)elementAt(i);
			String index = temp.getName().toString();
			j=i;
			while((j>0) && ((ExtPerson)elementAt(j-1)).getName().toString().compareTo(index)>0){
				set(j,elementAt(j-1));
				j=j-1;
			}
			
			set(j,temp);	
		}
		
	} //end-sort
	
	public void save(String filename) throws IOException {
	    FileWriter fout = new FileWriter(filename);
	    for(int i=0; i<size(); i++) 
			fout.write((ExtPerson)elementAt(i)+"\n");
			
 		fout.close();
    } //end-save

} //end-EmployeeList 

	
	
