package ui;

import java.util.ArrayList;
import java.util.Scanner;

import data.Employee;

public class UI {
	public static String readFileName() {
		System.out.println("Please, write the filename: ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		sc.close();
		return fileName;
	}
	
	public static void showSalaries(ArrayList<Employee> payroll) {
		// Paying monthly salaries to all workers ...
		for(Employee employee : payroll) {
			float sal = employee.paySalary();
			String name = employee.getName();
			System.out.println("NAME: " + name + "  SALARY: " + sal);
                }		
	}
}
