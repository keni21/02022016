package EmployeeRekrusion;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> employees=new ArrayList<>();
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	Employee findbyMaxSalary()
	{
		double maxSalary= 0.0;
		Employee emp=null;
		
		for (Employee employee : employees) {
			if(employee.getSalary()>=maxSalary)
			{
				maxSalary=employee.getSalary();
				emp=employee;
			}
		}return emp;
	}
	
	Employee findByEmpNumber(int number)
	{
		Employee numb=null;
		for (Employee employee : employees) {
			if(employee.getEmpNumber()==number)
			{
				numb=employee;
			}
		}
		return numb;
	}

	public ArrayList<Employee> findByDepartment(String department)
	{
		ArrayList<Employee>Dept=new ArrayList<>();
		for (Employee employee : employees) {
			if(employee.getDepartment().equals(department))
			{
				Dept.add(employee);
			}
		}
		return Dept;
	}

	public ArrayList<Employee> returnEmpList()
	{
		return employees;
	}

}
