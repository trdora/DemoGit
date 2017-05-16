package com.employees;

import java.text.SimpleDateFormat;

public  class ContractEmployee extends Employee {
	static int conCount = 0;
	private int ratePerHr;

	public int getRatePerHr() {
		return ratePerHr;
	}

	public void setRatePerHr(int ratePerHr) {
		this.ratePerHr = ratePerHr;
	}

	public int getNoOfHrWorked() {
		return noOfHrWorked;
	}

	public void setNoOfHrWorked(int noOfHrWorked) {
		this.noOfHrWorked = noOfHrWorked;
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	private int noOfHrWorked;
	private Contractor contractor;

	public ContractEmployee() {
		super();
		conCount++;
	}

	public ContractEmployee(String firstName, String lastName, int ratePerHr, int noOfHrWorked, Contractor contractor) {

		super(firstName, lastName);
		this.ratePerHr = ratePerHr;
		this.noOfHrWorked = noOfHrWorked;
		this.contractor = contractor;
		double salaryCal=(double)(ratePerHr*noOfHrWorked);
		setSalary(salaryCal);
		conCount++;
	}

	

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return ("Id: " + getEmployeeId() + " Name: " + getFirstName() + " " + getLastName() + " Salary: " + getSalary()
				+ " Joined on : " + sdf.format(getJoining()) + " Contractor Name: " + contractor.getContractorName());
	}

	@Override
	public void employeeCount() {
		System.out.println("No of Contract Employees: " +conCount);
	}

	@Override
	public void getDetails(int id) throws EmployeeNotFoundException {
		super.getDetails(id);
		Employee empDet = null;
		int index = 0;
		for (Employee emp : aList) {
			if (emp.getEmployeeId() == id)
				if (emp.getEmployeeId()==id){
					empDet=emp;
					break;
				}
		}
		
		
		if(empDet==null ){
			throw new EmployeeNotFoundException("Employee id: "+id+ " not found(Not a contract Employee");
		}
		else{
			System.out.println(empDet);
		}

	}
}
