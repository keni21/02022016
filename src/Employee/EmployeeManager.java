package Employee;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee>employees=new ArrayList<>();
	
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	public Employee findByMaxSalaray()
	{
		double MaxSalary=0.0;
		Employee max=null;
		
		for (Employee employee : employees) {
			if (employee.getSalary()>MaxSalary)
			{
				MaxSalary=employee.getSalary();
				max=employee;
			}
		}
		return max;
	}

	public Employee findByEmpNumber(int number)

	{
		for (Employee employee : employees) 
		{
			if(employee.getEmpNumber()==number)
			{
				return employee;
			}
		}
		return null;
	}
	
	public ArrayList<Employee>findByDepartment(String department)
	{
		ArrayList<Employee>list=new ArrayList<>();
		for (Employee employee : employees) {
			if(employee.getDepartment().equals(department))
			{
				list.add(employee);
			}
		}
		return list;
	}

	public ArrayList<Employee>ListAll(){
		ArrayList<Employee>All=new ArrayList<>();
		for (Employee employee : employees) {
			All.add(employee);
		}
		return All;
	}

}
