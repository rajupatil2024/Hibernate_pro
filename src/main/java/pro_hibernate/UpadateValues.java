package pro_hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpadateValues {

	public static void main(String[] args) {
				//Establish Connection
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
				//manage Entity Factory
				EntityManager manager=factory.createEntityManager();
				
				EntityTransaction transaction=manager.getTransaction();
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the ID number to Update the values");
				int id=sc.nextInt();
				
				Employee e=manager.find(Employee.class,id);
					
				System.out.println("Enter the Name to Upadate");
				String name=sc.next();
				System.out.println("Enter the Designation to Update ");
				String designation=sc.next();
				System.out.println("Enter the Salary to Update");
				double sal=sc.nextDouble();
					
					
					
				if(e!=null) {
					e.setName(name);
					e.setDesignation(designation);
					e.setSal(sal);
					transaction.begin();
					//Merge to the Existing data (to update values)
					manager.merge(e);
					transaction.commit();
					System.out.println("Successfully Updated...");
				}
				else {
					System.out.println("Id not found...");
				}
	}

}
