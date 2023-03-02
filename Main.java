package javaproject;

import java.util.Scanner;

public class Main {
	EmployeeService es=new EmployeeService();
	static boolean ordering=true;
	public static void menu() {
		System.out.println("----------Welcome to Employee Management System------------");
		System.out.println("1.Add Employee");
		System.out.println("2.View Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.View All Employee");
		System.out.println("6.Exit");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		do {
			menu();
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee");
				service.updateEmp();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("View All Employee");
				service.viewAllEmp();
				break;
			case 6:
				System.out.println("Thank U For Using Application");
				System.exit(0);
				default:
					System.out.println(" Please enter valid choice");
					break;
				
			
			}	
		}while(ordering);
			
		

	}

}
