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
		@Table(name= "emp600")   

		public class Address {    
		  
			@Id
			@Column(name = "slno")
		      private int slno;    
			
			@Column(name = "district")
		private String district;
			
			@Column(name = "state")
		private String state;

			@ManyToOne
			private List<Employee> employee=new ArrayList<Employee>();
			
			public List<Employee> getEmployee() {
				return employee;
			}

			public void setEmployee(List<Employee> employee) {
				this.employee = employee;
			}

			public int getSlno() {
				return slno;
			}

			public void setSlno(int slno) {
				this.slno = slno;
			}

			public String getDistrict() {
				return district;
			}

			public void setDistrict(String district) {
				this.district = district;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			@Override
			public String toString() {
				return "Address [slno=" + slno + ", district=" + district + ", state=" + state + ", employee="
						+ employee + "]";
			}    
		    
	
		}   


