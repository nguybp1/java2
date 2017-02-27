package v1;

import java.util.Random;

public class Employee {
	// Private variables
	private String firstName, lastName, idNumber, socialSecurityNumber, department;
	private int startYear, departmentCode;
	 
	// Default constructor
	public Employee(){
		firstName = "John";
		lastName = "Doe";
		startYear = 2017;
		idNumber = createIDNumber();
		socialSecurityNumber = "XXXXXXXXX";
		setSocial(socialSecurityNumber);
		department = "Java";
		departmentCode = 21;
	}
	 	 
	// Parameter constructor
	public Employee(String fN, String lN, String ssn, int sY, String dep, int depCode){
		firstName = fN;
		lastName = lN;
		socialSecurityNumber = ssn;
		setSocial(socialSecurityNumber);
		startYear = sY;
		department = dep;
		departmentCode = depCode;
		idNumber = createIDNumber();	
	}

	// Mutators (Setters)
	public void setFirstName(String fN){		 
		firstName = fN;
	}
	public void setLastName(String lN){		 
		lastName = lN;
	}	 
	// Format: 3Num-2Num-4Num		 
	public void setSocial(String ssn){
		socialSecurityNumber = ssn.substring(0,3) + "-" 
			+ ssn.substring(3,5) + "-" + ssn.substring(5);
	}	 
	public void setStartYear(int sY){		 
		startYear = sY;
	}
	public void setDepartment(String dep){
		department = dep;
	}
	public void setDepCode(int dC){
		departmentCode = dC;
	}
	 
	// Accessors (Getters)
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}	 
	public String getIDnumber(){
		return idNumber = createIDNumber();
	}	 
	public String getSocial(){
		return socialSecurityNumber;
	}	 
	public int getStartYear(){
		return startYear;
	}	 
	public String getDepartment(){
		return department;
	}	 
	public int getDepCode(){
		return departmentCode;
	}
	
	// Format: FNinitialLNinitial-4RandomNum		 
	private String createIDNumber(){
		Random randomNum = new Random();
		int randomInt = randomNum.nextInt(9999);
		String rNum = String.format("%04d", randomInt);
		String idNum = Character.toString(firstName.toUpperCase().charAt(0))
				+Character.toString(lastName.toUpperCase().charAt(0))+"-"+rNum;
		return idNum;
	}	 
	// Method toString()
	public String toString(){
//		idNumber = createIDNumber();
		return "Employe ID: " + idNumber
			+ "\nFirst name: " + firstName
			+ "\nLast name: " + lastName
			+ "\nSocial Security Number: " + socialSecurityNumber
			+ "\nStart year: " + startYear
			+ "\nDepartment: " + department
			+ "\nDepartment code: " + departmentCode + "\n";
	}	
}