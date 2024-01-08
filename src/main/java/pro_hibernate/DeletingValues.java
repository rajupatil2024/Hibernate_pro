package pro_hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletingValues {

	public static void main(String[] args) {
		//Establish Connection
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
		//manage Entity Factory
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID number to Delete values");
		int id=sc.nextInt();
		
		Employee e=manager.find(Employee.class,id);
		
		if(e!=null) {
			transaction.begin();
			manager.remove(e);
			transaction.commit();
		}
		else {
			System.out.println("Id is not found....");
		}

	}

}
