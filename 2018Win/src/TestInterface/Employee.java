package TestInterface;

public class Employee implements Comparable<Employee> {
		private String name;
		private double salaty;
		public Employee(String name,double salary) {
			this.name=name;
			this.salaty=salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalaty() {
			return salaty;
		}
		public void setSalaty(double salaty) {
			this.salaty = salaty;
		}
		public int compareTo(Employee other) {
			return Double.compare(this.salaty, other.salaty);
		}
	
	}


