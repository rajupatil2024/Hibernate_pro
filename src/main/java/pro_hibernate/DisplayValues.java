package pro_hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import demo_hibernate.Student;

public class DisplayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Establish Connection
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
				//manage Entity Factory
				EntityManager manager=factory.createEntityManager();
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the ID number to display values");
				int id=sc.nextInt();
				//Find the object is present or not
				Employee e=manager.find(Employee.class,id);
				
				if (e!=null)
				{
					System.out.println(e.getId()+" "+e.getName());
					System.out.println(e.getDesignation());
					System.out.println(e.getSal());
				}
				else {
					System.out.println("Id not found...");
				}

	}

}
