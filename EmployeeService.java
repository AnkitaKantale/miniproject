package javaproject;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	HashSet<Employee> empset=new HashSet<Employee>();
	Employee emp1=new Employee(101,"Monica",22,"Developer","IT",23000);
	Employee emp2=new Employee(102,"Ankita",21,"Testing","IT",60000);
	Employee emp3=new Employee(103,"Ankit",26,"Cloud Engg","IT",60000);
	Employee emp4=new Employee(104,"Atul",25,"Developer","IT",56000);
	Employee emp5=new Employee(105, "Aashwini",26, "Web Developer", "IT",63000);
	Scanner sc=new Scanner(System.in);
	  boolean found=false;
	  int id;
	  String name;
	  int age;
	  String Desiganation;
	  String Department;
	  double Salary;
	  public EmployeeService() {
		  empset.add(emp1);
		  empset.add(emp2);
		  empset.add(emp3);
		  empset.add(emp4);
		  empset.add(emp5);
	 
	  }
	  // view All Employee
	  public void viewAllEmp() {
		  for(Employee emp:empset) {
			  System.out.println(emp);}  
	  }
	  //view Emp Based on their id//
	  public void viewEmp() {
		  System.out.println("Enter Employee id");
		  id=sc.nextInt();
		  for(Employee emp:empset) {
			  if(emp.getId()==id){
				System.out.println(emp);
				found=true;
			  }
		  }
		  if(!found) {
			  System.out.println("Please enter correct employee id ");
	}
	  }
	  //update Employee
	  public void updateEmp() {
		  System.out.println("Enter Employee id");
		  id=sc.nextInt();
		  for(Employee emp:empset) {
			if(emp.getId()==id) {
				boolean found=true;
				System.out.println("Enter new  name:");
				name=sc.next();
				System.out.println("Enter new Salary");
				Salary=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(Salary);
				System.out.println("Updated details of employee are:");
				System.out.println(emp);
				found=true;
			}
		  }
		  if(!found) {
			System.out.println("Employee with this is not present ");  
		  }else {
			 System.out.println("Employere updated successfully!!"); 
		  }
	  }
	  //for delete employee
	  public void deleteEmp() {
		  System.out.println("Enter Id");
		  id=sc.nextInt();
		  boolean found=false;
		  Employee empdelete=null;
		  for(Employee emp:empset) {
			  if(emp.getId()==id) {
				  empdelete=emp;
				  found=true; 
			  }
		  }
		  if(!found) {
			System.out.println("Employee is not present");  
		  }else {
			  empset.remove(empdelete);
			  System.out.println("Employee deleted successfully");
		  }
	  }
	  public void addEmp() {
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enter Desiganation");
		Desiganation = sc.next();
		System.out.println("Enter Department");
		Department=sc.next();
		System.out.println("Enter Salary");
		Salary=sc.nextDouble();
		Employee emp=new Employee(id, name, age, Desiganation, Department, age);
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added successfully");
	}

}
