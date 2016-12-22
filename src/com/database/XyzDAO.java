package com.database;

import java.util.ArrayList;
import java.util.List;

public class XyzDAO {  
	
	private static List customers;
	{
		customers = new ArrayList();
		customers.add(new Xyz(101, "Mark"));
		customers.add(new Xyz(201, "William"));
		customers.add(new Xyz(301, "Satya"));
	}
	
	public List list() {
		return customers;
	}
/*
	public Xyz create(Xyz customer) {
		customer.setId(System.currentTimeMillis());
		customers.add(customer);
		return customer;
	}
	*/
	
	/*public Long delete(Long id) {

		for (Xyz c : customers) {
			if (c.getId().equals(id)) {
				customers.remove(c);
				return id;
			}
		}
		*/
/*int arr[]={12,13,14,44};  
		  
		   for(int i:arr
*/
}
