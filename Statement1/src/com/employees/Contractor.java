package com.employees;

public class Contractor {
	private int contractorId;
	private String contractorName;
	private String contractorLocation;
	
	public Contractor(){
		
	}
	public Contractor(int contractorId, String contractorName, String contractorLocation) {
		this();
		this.contractorId = contractorId;
		this.contractorName = contractorName;
		this.contractorLocation = contractorLocation;
	}
	public int getContractorId() {
		return contractorId;
	}
	public void setContractorId(int contractorId) {
		this.contractorId = contractorId;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getContractorLocation() {
		return contractorLocation;
	}
	public void setContractorLocation(String contractorLocation) {
		this.contractorLocation = contractorLocation;
	}
	
	
}
