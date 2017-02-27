package v1;

public class EmployeeTester {	
	// Driver class
	public static void main(String[] args){
		Employee e1 = new Employee();
		System.out.println("Employee e1 (default)");
		System.out.println(e1);
		Employee e2 = new Employee("Jone", "Smith", "123456789", 2017, "IT", 1234);
		System.out.println("Employee e2 (para)");
		System.out.println(e2);
	}
}
