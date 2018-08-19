package com.infosys.in.HibernateExample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity  
	@Table(name= "emp500")   

	public class Employee {    
	  
		@Id
		@Column(name = "id")
	      private int id;    
		
		@Column(name = "fname")
	private String firstName;
		
		@Column(name = "lname")
	private String lastName;   
		
		
		
    /*private  List<Address> add=new ArrayList<Address>();		
	public List<Address> getAdd() {
		return add;
	}
	public void setAdd(List<Address> add) {
		this.add = add;
	}*/
		
		@OneToMany(mappedBy="employee")
		
		private Address add;
		
		
	public Address getAdd() {
			return add;
		}
		public void setAdd(Address add) {
			this.add = add;
		}
	public int getId() {    
	    return id;    
	}    
	public void setId(int id) {    
	    this.id = id;    
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
	}   


