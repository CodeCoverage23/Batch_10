package com.java8MagicFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoMain {

	public static void main(String[] args) {
		List<Integer> al1 =Arrays.asList(2,3,56,89,98,43,23);
//		al1.stream().sorted().collect(Collectors.toList()).forEach(a->System.out.println(a));
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, 201, "Active", "Kant", 40000.00));
		al.add(new Employee(102, 201, "Inactive", "Krishna", 10000.00));
		al.add(new Employee(103, 202, "Active", "Tushar", 60000.00));
		al.add(new Employee(104, 202, "Active", "Nayan", 50000.00));
		al.add(new Employee(105, 203, "Active", "Sonu", 45000.00));
		al.add(new Employee(106, 204, "Inactive", "Tejas", 40000.00));
		al.add(new Employee(107, 201, "Active", "Payal", 47000.00));
		al.add(new Employee(108, 204, "InActive", "Satish", 27000.00));
		
		//Highest Sal
		
		Employee highestNumber = al.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).findFirst().orElse(null);
//		System.out.println(highestNumber);
		
		//2nd Highest Sal
		
		Employee employee2ndHighsal = al.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(1).findFirst().get();
//        System.out.println(employee2ndHighsal);
        
//        Print emp is working on each dept
        
        Map<Integer, List<Employee>> listWithEaschDept = al.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
        listWithEaschDept.entrySet().forEach(entry->{
//        	System.out.println("Dept" + entry.getKey()+ " List of Emp " +entry.getValue());
        });
        
//        Print emp count is working on each dept
        
        Map<Integer, Long> listWithEaschDeptWithCount = al.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
        listWithEaschDeptWithCount.entrySet().forEach(entry->{
        	System.out.println("Dept" + entry.getKey()+ " List of Emp " +entry.getValue());
        }); 
        
//        print emp count of InActive
       long countInactive = al.stream().filter(e->"InActive".equalsIgnoreCase(e.getStatus())).count();
        System.out.println("Count of InActive Employee are " + countInactive);
        
//      print emp count of Active
     long countActive = al.stream().filter(e->"Active".equalsIgnoreCase(e.getStatus())).count();
      System.out.println("Count of Active Employee are " + countActive);
      
//      Max Sal Emp
      Optional<Employee> max = al.stream().max((Comparator.comparingDouble(Employee::getSal)));
      System.out.println(max);
      
//      Min Sal Emp
      Optional<Employee> min = al.stream().min((Comparator.comparingDouble(Employee::getSal)));
      System.out.println(min);
	}

}
