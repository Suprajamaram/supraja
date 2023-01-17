package StaticExample;

public class Employee {
	
	String employeeName;
	String department;
	String designation;
	Static int id =0;
	
	Employee(){
		id++;
		System.out.println("Your Emp id is"+id);	
				
	}
	
	public static void main[String[] args) {
		// ToDo Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
	}

}
