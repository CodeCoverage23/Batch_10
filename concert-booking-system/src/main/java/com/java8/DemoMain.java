package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoMain {

	public static void main(String[] args) {
		
		//int[] arr = { 2, 1, 3, 4, 6, 7, 8, 9, 6 };
	//===============================================================================	
		List<Integer>  al1 = Arrays.asList( 2, 1, 3, 4, 6, 7, 8, 9, 6);
		
		//al1.stream().sorted().collect(Collectors.toList()).forEach(a->System.out.print(a));
//============================================================================================
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(101, 201, "Active", "Swami", 40000.00));
		al.add(new Employee(102, 201, "Inactive", "Nisarga", 10000.00));
		al.add(new Employee(103, 202, "Active", "Tushar", 60000.00));
		al.add(new Employee(104, 202, "Active", "Pooja", 50000.00));
		al.add(new Employee(105, 203, "Active", "Kalyani", 45000.00));
		al.add(new Employee(106, 204, "Inactive", "Khalid", 40000.00));
		al.add(new Employee(107, 201, "Active", "Mrunali", 47000.00));
		al.add(new Employee(108, 204, "InActive", "Pratiksha", 27000.00));

		//heights Sal
		
		Employee employeeHighsal = al.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).findFirst().orElse(null);
        System.out.println(employeeHighsal);
        
      //2nd heights Sal
        Employee employee2ndHighsal = al.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(1).findFirst().get();
        System.out.println(employee2ndHighsal);
        
        //print emp is working on each dept
        
        Map<Integer,List<Employee>> listWthEachDept = al.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
        
        listWthEachDept.entrySet().forEach(entry->{
        	System.out.println("Dept "+entry.getKey()+ " List of Emp "+ entry.getValue());
        });
        //print emp count is working on each dept

        
        Map<Integer,Long> listWthEachDeptWithCount = al.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
        
        listWthEachDeptWithCount.entrySet().forEach(entry->{
        	System.out.println("Dept "+entry.getKey()+ " List of Emp "+ entry.getValue());
        });
        
      //print emp count of Active
        long count = al.stream().filter(e->"Active".equalsIgnoreCase(e.getStatus())).count();
        System.out.println("Count of Active Employees are "+count);
        
      //print emp count of InActive
        long countInActive = al.stream().filter(e->"InActive".equalsIgnoreCase(e.getStatus())).count();
        System.out.println("Count of InActive Employees are "+countInActive);
        
        //max sal emp
        Optional<Employee> max = al.stream().max((Comparator.comparingDouble(Employee::getSal)));
        System.out.println(max);
        //Min sal Emp
        Optional<Employee> min = al.stream().min((Comparator.comparingDouble(Employee::getSal)));
        System.out.println(min);
}
}
