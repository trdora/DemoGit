package com.employees;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Employee {
	
	static int count=0;
	static List<Employee> aList=new ArrayList<>();
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private Date joining;
	public Employee() {
		count++;
		employeeId=count;
	}
	public Employee(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public Employee(String firstName, String lastName, double salary) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoining() {
		return joining;
	}
	public void setJoining(int year, int month,int date) {
		Calendar cal=Calendar.getInstance();
		cal.set(year, month, date);
		this.joining = cal.getTime();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public static void putDetails(Employee e){
		aList.add(e);
	}
	
	public void getDetails(int id) throws EmployeeNotFoundException {
	
		boolean b=false;
		for(Employee emp: aList){
			if(id==emp.getEmployeeId()){
				b=true;
				break;
			}
		}
		if(b==false){
			throw new EmployeeNotFoundException("Employee id: "+id+ " not found");
		}
	}
	public abstract void employeeCount();

}
