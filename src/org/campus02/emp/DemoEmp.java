package org.campus02.emp;

import java.util.ArrayList;

public class DemoEmp {

	public static void main(String[] args) {
		
		EmployeeManager em = new EmployeeManager();
		
		Employee emp1 = new Employee(123, "Max Mustermann", 1000.0, "Engineering");
		em.addEmployee(emp1);
		
		Employee emp2 = new Employee(456, "Susi Sorglos", 2500.0, "Engineering");
		em.addEmployee(emp2);
		
		Employee emp3 = new Employee(789, "Ano Nym", 4900.0, "Management");
		em.addEmployee(emp3);
		
		Employee empByNumber1 = em.findByEmpNumber(123);
		System.out.println("has number 123 -> " + empByNumber1);
		
		Employee empByNumber2 = em.findByEmpNumber(999);
		System.out.println("has number 999 -> " + empByNumber2);
		
		ArrayList<Employee> byDept = em.findByDepartment("Engineering");
		System.out.println("Engineering (" + byDept.size()+") -> "+byDept);
		
		Employee empMaxSalary = em.findByMaxSalary();
		System.out.println("has MAX salary -> " + empMaxSalary);
		
		//__________________________________________________________________________________________________________-
		
		
		
		
		Employee Mitarbeiter1 =new Employee(1, "Mitarbeiter1", 1700, "GTC", "CEO" );
		em.addEmployee(Mitarbeiter1);
		
		
		Employee Mitarbeiter2 =new Employee(2, "Mitarbeiter2", 1900, "IT", "HR" );
		em.addEmployee(Mitarbeiter2);
		Mitarbeiter2.setSuperior(Mitarbeiter1);
		
		
		Employee Mitarbeiter3 =new Employee(3, "Mitarbeiter3", 2000, "IT", "CTO" );
		em.addEmployee(Mitarbeiter3);
		Mitarbeiter3.setSuperior(Mitarbeiter1);
		
		
		Employee Mitarbeiter4 =new Employee(4, "Mitarbeiter4", 4000, "PDE", "DEV" );
		em.addEmployee(Mitarbeiter4);
		Mitarbeiter4.setSuperior(Mitarbeiter3);
		
		
		Employee Mitarbeiter5 =new Employee(5, "Mitarbeiter5", 2000, "PDE", "DEV" );
		em.addEmployee(Mitarbeiter5);
		Mitarbeiter5.setSuperior(Mitarbeiter3);
		
		
		Mitarbeiter1.addSubordinates(Mitarbeiter2);
		Mitarbeiter1.addSubordinates(Mitarbeiter3);
		
		Mitarbeiter2.addSubordinates(Mitarbeiter4);
		Mitarbeiter2.addSubordinates(Mitarbeiter5);
		
		
		System.out.println("_______________________________________________________________________");
		System.out.println();
		System.out.println(Mitarbeiter4.toString());
		
		OrganiegramHandler Mit4 = new OrganiegramHandler();
		System.out.println(Mit4.getChainOfCommand(Mitarbeiter1));
		
		
		System.out.println("____________________________________________________");
		System.out.println(OrganiegramHandler.processHierarchy(Mitarbeiter1));

	}

}
