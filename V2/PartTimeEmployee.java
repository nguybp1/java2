package v2;

public class PartTimeEmployee extends Employee{
	// Fields
	private double weeklyHoursWorked, hourlyRate;
	// Constructors
	public PartTimeEmployee(){
		super();
		weeklyHoursWorked=0;
		hourlyRate=0;
	}
	public PartTimeEmployee(String fN, String lN, String ssn, int sY, String dep, int depCode, double whw, double hr){
		super(fN,lN,ssn,sY,dep,depCode); // call superclass
		weeklyHoursWorked=whw;
		hourlyRate=hr;
	}
	// Accessors (Getters)
	public double getWeeklyHoursWorked(){
		return weeklyHoursWorked;
	}
	public double getHourlyRate(){
		return hourlyRate;
	}
	// Mutators (Setters)
	public void setWeeklyHoursWorked(double whw){
		weeklyHoursWorked=whw;
	}
	public void setMailingList(double hr){
		hourlyRate=hr;
	}
	// Methods
	public double CalculateWeeklyPay(){
		double weeklyPay;
		if(weeklyHoursWorked<=40)
			weeklyPay = weeklyHoursWorked * hourlyRate;
		else
			weeklyPay = (40 * hourlyRate)+((weeklyHoursWorked-40) * hourlyRate * 1.5);
		return weeklyPay;
	}	
	// Method toString()
	public String toString(){
//		return "Employee ID: "+this.getIDnumber()+"\nFirst name: "+this.getFirstName()+"\nLast name: "+this.getLastName()
//		+"\nSocial Security Number: "+this.getSocial()+"\nStart year: "+this.getStartYear()+"\nDepartment: "+this.getDepartment()
//		+"\nDepartment code: "+this.getDepCode()+"\nWeekly Hours Worked: "+weeklyHoursWorked++"\nHourly Rate: "+hourlyRate+"\nWeekly Pay: "+CalculateWeeklyPay()+"\n";
		return super.toString()+"Weekly Hours Worked: "+weeklyHoursWorked+"\nHourly Rate: "+hourlyRate+"\nWeekly Pay: "+CalculateWeeklyPay()+"\n";
	}
}
