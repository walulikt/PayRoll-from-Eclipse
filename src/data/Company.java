package data;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Company {

	ArrayList <Employee> company;
	
	
	public Company () {
		company = new ArrayList <Employee> ();
		
		}

public void isThere (ArrayList <Employee> sample, String lastName) {
	
	for (Employee employee: sample) {
		if (employee.getLastName().equals(lastName))
		System.out.println("Pracownik o nazwisku: " + lastName + " jest zatrudniony. Jego dane to: " + employee.toString() );
	}
}
}
