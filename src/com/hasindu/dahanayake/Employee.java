package com.hasindu.dahanayake;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Long id;
	private List<Address> address;
	private String employeeName;

	public Employee() {
		super();

	}

	public Employee(Long id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
    
	/**
	 * Cloned method implementation
	 */
	@Override
	protected Object clone() {
		Employee employee = null;
		try {
			employee = (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			employee = new Employee(this.getId(), this.getEmployeeName());
		}
		List<Address> clonedAdressList = new ArrayList<>();
		this.address.stream().forEach(address -> clonedAdressList.add((Address) address.clone()));
		employee.setAddress(clonedAdressList);
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + ", employeeName=" + employeeName + "]";
	}

}
