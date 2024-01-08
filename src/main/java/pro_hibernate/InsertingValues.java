package pro_hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertingValues {

	public static void main(String[] args) {
		
				//Establish Connection
				EntityManagerFactory factory= Persistence.createEntityManagerFactory("raju");
				
				//manage Entity Factory
				EntityManager manager=factory.createEntityManager();
				
				//whenever Transaction is going to happen
				EntityTransaction transaction=manager.getTransaction();
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number of Employees to be added");
				int num=sc.nextInt();
				System.out.println("===========================================");
				
				
				for(int i=0; i<num; i++) {
					System.out.println("Enter the id");
					int id=sc.nextInt();
					System.out.println("Enter the name");
					String name=sc.next();
					System.out.println("Enter the Designation");
					String designation=sc.next();
					System.out.println("Enter the Salary");
					double sal=sc.nextDouble();
					
					Employee e=new Employee();
					e.setId(id);
					e.setName(name);
					e.setDesignation(designation);
					e.setSal(sal);
					
					transaction.begin();
					manager.persist(e);
					transaction.commit();
					System.out.println("Data insert Successfully");
					System.out.println("===========================================");
				}	
				System.err.println("Limit Ecceeded...");
	}


}
