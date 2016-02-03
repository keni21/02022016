package EmployeeRekrusion;

import java.util.ArrayList;



public class Demo {

	public static void main(String[] args) {

		Employee emp1= new Employee(1,"emp1",2000, "IT");
		Employee emp2= new Employee(2,"emp2",2400, "EDV");
		Employee emp3= new Employee(3,"emp3",2200, "IT");
		
		EmployeeManager Manager=new EmployeeManager();
		
		Manager.addEmployee(emp1);
		Manager.addEmployee(emp2);
		Manager.addEmployee(emp3);
		
		System.out.println(Manager.findbyMaxSalary());
		System.out.println(Manager.findByEmpNumber(2));
		
		System.out.println("________________________________________________________");
	
		System.out.println(Manager.findByDepartment("IT"));
		System.out.println("________________________________________________________");
		
		//__________________________________________________________________________________
		
		System.out.println(Manager.returnEmpList());
		
		Employee Miatarbeiter1=new Employee(1, "Mitarbeiter1", 3000, "FE", "CEO");
		Employee Miatarbeiter2=new Employee(2, "Mitarbeiter2", 2800, "IT", "CTO");
		Employee Miatarbeiter3=new Employee(3, "Mitarbeiter3", 2800, "Sofatware", "DEV");
		Employee Miatarbeiter4=new Employee(4, "Mitarbeiter4", 2500, "Sofatware", "DEV");
		Employee Miatarbeiter5=new Employee(5, "Mitarbeiter5", 2500, "HR", "HR");
		
		Miatarbeiter2.setSuperior(Miatarbeiter1);
		Miatarbeiter3.setSuperior(Miatarbeiter2);
		Miatarbeiter4.setSuperior(Miatarbeiter2);
		Miatarbeiter5.setSuperior(Miatarbeiter1);
		
		Miatarbeiter1.add(Miatarbeiter2);
		Miatarbeiter1.add(Miatarbeiter5);
		//__________________________________________________________
		Miatarbeiter2.add(Miatarbeiter3);
		Miatarbeiter2.add(Miatarbeiter4);
		
		OrganigramHandler Organigram=new OrganigramHandler();
		System.out.println("________________________________________________________");
		System.out.println(OrganigramHandler.getChainOfCommand(Miatarbeiter3));
		
		System.out.println("________________________________________________________");
		System.out.println(OrganigramHandler.ProcessHierachy(Miatarbeiter1, ""));
		
		
	}

}
