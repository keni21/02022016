package Employee;

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
		
		System.out.println(Manager.findByMaxSalaray());
		System.out.println(Manager.findByEmpNumber(2));
		
		System.out.println("________________________________________________________");
		ArrayList<Employee>e=Manager.findByDepartment("IT");
		System.out.println(e);
		System.out.println("________________________________________________________");
		
		//__________________________________________________________________________________
		
		System.out.println(Manager.ListAll());
		
		Employee Miatarbeiter1=new Employee(1, "Mitarbeiter1", 3000, "FE", "CEO");
		Employee Miatarbeiter2=new Employee(2, "Mitarbeiter1", 2800, "IT", "CTO");
		Employee Miatarbeiter3=new Employee(3, "Mitarbeiter1", 2800, "HR", "HR");
		Employee Miatarbeiter4=new Employee(4, "Mitarbeiter1", 2500, "Sofatware", "DEV");
		Employee Miatarbeiter5=new Employee(5, "Mitarbeiter1", 2500, "Software", "DEV");
		
		Miatarbeiter2.setSuperior(Miatarbeiter1);
		Miatarbeiter3.setSuperior(Miatarbeiter2);
		Miatarbeiter4.setSuperior(Miatarbeiter2);
		Miatarbeiter5.setSuperior(Miatarbeiter1);
		
		OrganigramHandler Organigram=new OrganigramHandler();
		System.out.println("________________________________________________________");
		System.out.println(OrganigramHandler.getChainOfCommand(Miatarbeiter3));
		
		System.out.println("________________________________________________________");
		System.out.println(OrganigramHandler.processHierarchy(emp2));
	}

}
