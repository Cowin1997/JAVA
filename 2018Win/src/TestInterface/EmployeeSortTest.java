package TestInterface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSortTest {
	public static void main(String []args) {
		Employee[]staff =new Employee[3];
		staff[0]=new Employee("staff_1",2000);
		staff[1]=new Employee("staff_2",1000);
		staff[2]=new Employee("staff_3",3000);
		Arrays.sort(staff);
		for(Employee e:staff) {
			System.out.println(e.getName()+";"+e.getSalaty());
		}
	}

}
