package java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.basic.Collection.Employee;

public class FilterMapDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Tushar",56000));
		empList.add(new Employee(20, "Kant",76000));
		empList.add(new Employee(30, "Nayan",26000));
		empList.add(new Employee(40, "Krishna",96000));
		empList.add(new Employee(50, "Deep",50000));
		empList.add(new Employee(60, "Tejas",46000));
		System.out.println(empList);
		
		//get the emp with salary < 55..!!
		
		List<Employee> empListWithSalary55 = empList.stream().filter(f -> f.getSalary() > 55000).collect(Collectors.toList());
		System.out.println(empListWithSalary55);
		
		//get the emp salary..!!
		
		List<Double> empSalary = empList.stream().map(m -> m.getSalary()).toList();
		System.out.println(empSalary);
		
	}

}
