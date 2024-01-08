package pro_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
		private int id;
		private String name;
		private String designation;
		private double sal;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getSal() {
			return sal;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}

}
