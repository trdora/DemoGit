package com.employees;

public class ManageEmployee {

	public static void main(String[] args) {
		Employee emp1=new PermanentEmployee("Ravi", "Kumar", 100000.0);
		emp1.setJoining(2017, 05, 13);
		Employee emp2=new PermanentEmployee("Tushar", "Kumar", 200000.0);
		emp2.setJoining(2017, 05, 21);
		
		Contractor con=new Contractor(23, "Capgemini", "Talawade");
		Employee emp3=new ContractEmployee("Ashwin", "Kumar", 2000, 500, con);
		emp3.setJoining(2017, 06, 23);
		
		
		
		Employee emp4=new ContractEmployee("Ashish", "Kumar", 1000, 500, con);
		emp4.setJoining(2017, 06, 29);
		
		Employee emp5=new PermanentEmployee("Kamal", "Kumar", 300000.0);
		emp5.setJoining(2017, 05, 22);
		Employee.putDetails(emp1);
		Employee.putDetails(emp2);
		Employee.putDetails(emp3);
		Employee.putDetails(emp4);
		Employee.putDetails(emp5);
		
		try {
			
			emp3.employeeCount();
			emp2.employeeCount();
			emp3.getDetails(1);
			emp3.getDetails(2);
			emp3.getDetails(3);
			emp3.getDetails(4);
			emp3.getDetails(5);
			emp3.getDetails(0);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
	}

}
