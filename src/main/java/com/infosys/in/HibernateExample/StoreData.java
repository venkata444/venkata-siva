package com.infosys.in.HibernateExample;
	
	import org.hibernate.Session;    
	import org.hibernate.SessionFactory;    
	import org.hibernate.Transaction;  
	import org.hibernate.boot.Metadata;  
	import org.hibernate.boot.MetadataSources;  
	import org.hibernate.boot.registry.StandardServiceRegistry;  
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
	  
	    
	public class StoreData {    
	public static void main(String[] args) {    

	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("resources/hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	            
	
	  Employee e1=new Employee();    
	    e1.setId(24);    
	    e1.setFirstName("ganesh");    
	    e1.setLastName("kumar");    
	    session.persist(e1);	 
	    
	    
		Address ad=new Address();
		ad.setSlno(1);
		ad.setDistrict("East Godavari");
		ad.setState("Andhra Pradesh");
/*		ad.getEmployee().add(e1);
*/		
		/*e1.getAdd().add(ad);*/
	    
	    session.persist(ad);
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	        
	}    
	}   


