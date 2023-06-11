package com.app.utility;

import java.util.HashMap;
import java.util.Map;

import com.app.entity.Department;
import com.app.entity.Employee;

public class DemoData {
	
	public static Map<Integer, Employee> getDemoData(){
		Map<Integer, Employee> map = new HashMap<>();
		
		map.put(1, new Employee(1,"Prajwal", 200000.0,Department.valueOf("Hr".toUpperCase())));
		map.put(2, new Employee(2,"John", 3500000.0,Department.valueOf("it".toUpperCase())));
		map.put(3, new Employee(3,"Rock", 450500.0,Department.valueOf("sales".toUpperCase())));
		map.put(4, new Employee(4,"Tom", 204550.0,Department.valueOf("sales".toUpperCase())));
		map.put(5, new Employee(5,"Chris", 485000.0,Department.valueOf("Hr".toUpperCase())));
		map.put(6, new Employee(6,"Michael", 1100000.0,Department.valueOf("it".toUpperCase())));

		
		
		return map;
	}
}
