package com.app.Tester;

import static com.app.utility.ValidateEmployee.checkDuplicates;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

import com.app.entity.Department;
import com.app.entity.Employee;
import com.app.utility.DemoData;
import com.app.utility.IOUtils;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {

			IOUtils.storeEmpDetails(DemoData.getDemoData(), "Employee.ser");
			Map<Integer, Employee> map = IOUtils.restoreEmpDetails("Employee.ser");

			
			while (true) {
				System.out.println("1.Add Employee\n" 
						+ "2.Display All Employee Details\n"
						+ "3.Retrive by EmpID\n"
						+ "4.Delete by EmpID\n"
						+ "0.Exit");

				try {
					switch (sc.nextInt()) {
					case 1:

						System.out.println("Enter following employee details:empID,name,salary,department");
						Integer empId = sc.nextInt();
						checkDuplicates(map, empId);
						map.put(empId, new Employee(empId, sc.next(), sc.nextDouble(),
								Department.valueOf(sc.next().toUpperCase())));

						break;

					case 2:

						map.forEach((k, v) -> System.out.println(v));

						break;
						
					case 3:							
						System.out.println("Enter the employee Id: ");
						int id=sc.nextInt();
						map.values().stream()
						.filter(v -> v.getEmpID().equals(id))
						.forEach(i -> System.out.println(i));
						break;

					case 4:							
						System.out.println("Enter the employee Id: ");
						id=sc.nextInt();
						
						map.values()
						.removeIf(v -> v.getEmpID().equals(id));
						break;
					case 0:
						
						IOUtils.storeEmpDetails(map,"Employee.ser");
						System.exit(0);
						break;

					}

				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}

			}

		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
