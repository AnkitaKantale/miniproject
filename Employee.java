package javaproject;

public class Employee {
	 private int id;
	 private String name;
	 private int age;
	 private String Desiganation;
	 private String Department;
	 private double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesiganation() {
		return Desiganation;
	}
	public void setDesiganation(String desiganation) {
		Desiganation = desiganation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	 @Override
	 public String toString() {
		return "Employee [id="+ id + ",name="+ name + ",age="+ age + ",desiganation="+ Desiganation+ ""
				+ ",department="+Department + ",salary="+ Salary +"]";
		 
	 }
	 public Employee(int id, String name, int age, String Desiganation, String Department, int Salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.Desiganation=Desiganation;
		this.Department=Department;
		this.Salary=Salary;
	}
	 
}