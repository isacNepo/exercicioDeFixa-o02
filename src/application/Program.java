package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", emp.name ,emp.netSalaty());
		System.out.println();		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f%n", emp.name, emp.increaseSalary(percentage));
	}

}
