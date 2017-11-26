package data;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double contractWorkingTime;
	private String position;
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getContractWorkingTime() {
		return contractWorkingTime;
	}
	public void setContractWorkingTime(double contractWorkingTime) {
		this.contractWorkingTime = contractWorkingTime;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String toString () {
		return "Pracownik: " + firstName + lastName + " zatrudniony jest na: " + contractWorkingTime;
	}
	
	public Employee (String firstName, String lastName, double contractWorkingTime, String position) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.contractWorkingTime=contractWorkingTime;
		this.position=position;
	}
// Obliczenia wyp³aty dla urzêdnika:	
	private double basicWage = 1400; 
	
	
		public double getBasicWage() {
			return basicWage;
		}

		public void setBasicWage(double basicWage) {
			this.basicWage = basicWage;
		}
	
	double officialPayroll = 0;
	
	
		public double officialPayrollFormula (double discretionalyBonus) { //Random z przedzia³u 0-50)
			officialPayroll = getContractWorkingTime()*basicWage+ basicWage*(discretionalyBonus*0.01);
			return officialPayroll;
		}
		public void officialPrintInfo () {
			System.out.println("Wysokoœæ wyp³aty" + getFirstName()+" " +getLastName()+ " wynosi: " + officialPayroll);
		}
// Obliczenia wyp³¹ty dla robotnika:	
	private double wagePerHour=15;
	private double hoursLimit=42;
		

		double workerPeyroll = 0;
		public double workerPeyrollFormula (int workedHours) {
		
			if (workedHours>hoursLimit) {
				workerPeyroll = (workedHours*wagePerHour)+((hoursLimit-workedHours)*(wagePerHour*1.5));
			} else {
				workerPeyroll = (workedHours*wagePerHour);
			}
			return workerPeyroll;
		}
		
		public void workerPrintInfo () {
			System.out.println("Wysokoœæ wyp³aty" + getFirstName()+" " +getLastName()+ " wynosi: " + workerPeyroll);
		}
		public boolean contains(String lastName) {
			// TODO Auto-generated method stub
			return false;
		}
		
			
}
