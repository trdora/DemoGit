package com.employees;

import java.text.SimpleDateFormat;

public class PermanentEmployee extends Employee{

	static int perCount=0;
	public PermanentEmployee(){
		super();
		perCount++;
	}
	public PermanentEmployee(String firstName, String lastName, double salary) {
		super(firstName, lastName, salary);
		perCount++;
	}
	
	public String toString(){
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return ("Id: "+getEmployeeId()+" Name: "+getFirstName()+" "+getLastName()+" Salary: "+getSalary()+" Joined on : "+sdf.format(getJoining()));
	}
	
	@Override
	public void employeeCount(){
		System.out.println("No of Permanent Employees: " +perCount);
	}
	
	@Override
	public void getDetails(int id) throws EmployeeNotFoundException{
		super.getDetails(id);
		Employee empDet=null;
		
		for(Employee emp: aList){
			if (emp.getEmployeeId()==id){
				empDet=emp;
				break;
			}
				
		}
		if(empDet==null ){
			throw new EmployeeNotFoundException("Employee id: "+id+ " not found(Not a permanent Employee");
		}
		else{
			System.out.println(empDet);
		}
		
	}

}
