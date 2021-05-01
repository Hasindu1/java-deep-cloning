package com.hasindu.dahanayake;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Original Address Object
		Address originalAddress = new Address("Sri Lanka", "Colombo", "Colombo", "21/2 ,Araliya Road,Colombo 03");

		// Cloning an new Address
		Address clonedAddress = (Address) originalAddress.clone();

		// Setting a different address value to the cloned object
		clonedAddress.setAdressValue("21/3,Temple Road,Colombo 02");

		// Outputting the original and cloned Address objects to ensure that only
		// cloned Address object addressValue got changed
		System.out.println("Original Address ---> " + originalAddress);
		System.out.println("Cloned Address ---> " + clonedAddress);

		// Original Employee Object
		Employee originalEmployee = new Employee(10L, "Hasindu Dahnayake");

		// Inserting the original Address object as the first element
		List<Address> addressList = new ArrayList<>();
		addressList.add(originalAddress);

		// Setting the adressList to the original Employee
		originalEmployee.setAddress(addressList);

		// Cloning a new Employee
		Employee clonedEmployee = (Employee) originalEmployee.clone();

		// Changing the Employee name and address
		clonedEmployee.setEmployeeName("Jhon");
		clonedEmployee.getAddress().get(0).setCity("Kottawa");

		// Outputting the original and cloned Employee objects to ensure that only
		// clonedEmployee values got changed
		System.out.println("Original Address ---> " + originalEmployee);
		System.out.println("Cloned Employee ---> " + clonedEmployee);

	}

}
