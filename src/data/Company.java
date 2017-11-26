package data;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Company {

	ArrayList <Employee> company;
	
	
	public Company () {
		company = new ArrayList <Employee> ();
		
		}
	
	
	
	String lastNameSearch = "Kowalski";
public void isThere (ArrayList <Employee> sample, String lastName) {
	
	for (Employee empLastName: sample) {
		if (empLastName.contains(lastName));
		System.out.println("Pracownik o nazwisku: " + lastName + " jest zatrudniony. Jego dane to: " + sample.indexOf(empLastName));
	}
}
}
