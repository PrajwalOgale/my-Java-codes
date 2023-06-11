package com.app.utility;

import java.util.Map;

import javax.management.RuntimeErrorException;

import com.app.entity.Employee;

public class ValidateEmployee {
	
	
	public static void checkDuplicates(Map<Integer, Employee> map, Integer empId) throws ValidateEmployeeException{
		
		if(map.containsKey(empId)) {
			throw new ValidateEmployeeException("Duplicate found.");
		}
	}
}
