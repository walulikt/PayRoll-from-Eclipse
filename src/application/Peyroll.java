package application;

import java.util.ArrayList;
import java.util.Random;

import data.Company;
import data.Employee;

public class Peyroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Employee> employee = new ArrayList<>();

		for (int i=0; i<50; i++) {
			employee.add(new Employee("Jan " + i, "Kowalski " + i, 1, "official" ));
			
		}
		for (int i=50; i<100; i++) {
			employee.add(new Employee("Adam " + i, "Nowa " + i, 1, "Worker" ));
		}
		System.out.println ("Rozmiar kolekcji Book typu LinkedList: " +employee.size());
	
	Random randomBonus = new Random ();
	Random randomHours = new Random ();
	for (Employee payOut: employee) {
		if (payOut.getPosition() == "official") {
			payOut.officialPayrollFormula(randomBonus.nextDouble()+50);
			payOut.officialPrintInfo();
		} else {
			payOut.workerPeyrollFormula(randomHours.nextInt(45)+10);
			payOut.workerPrintInfo();
		}
	}
	
	for (Employee isThere: employee) {
		if (isThere.getLastName()=="Kowalski") {
			System.out.println("W firmie pracuje: " + isThere.toString());
		}
	}
	
	Company comp = new Company ();
	comp.isThere(employee, "Kowalski");
	
//	String lastNameExp = "Kowalski 10";
//	for (Employee isThere2: employee) {
//		employee.contains(lastNameExp);
//		System.out.println("Jest pracownik o nazwiksu: " + lastNameExp + " Jego dane: "+ isThere2.toString());
//	}
	}

}


