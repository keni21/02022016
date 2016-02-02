package org.campus02.emp;

import java.util.ArrayList;

public class OrganiegramHandler {
	
	public static String getChainOfCommand(Employee employee)
	{
		String ausgabe=employee.getName()+", ["+employee.getRole()+"]";
		if (employee.getSuperior()==null)
		{
			
			return  ausgabe;
		}
		//System.out.println("Hat den Vorgesezten "+employee);
		//System.out.println();
		ausgabe=employee.getName()+", ["+employee.getRole()+"] -> ";
		return ausgabe+ getChainOfCommand(employee.getSuperior());
	}
	
	public static String processHierarchy(Employee emp) {
	
	if(emp.getSubordinates().size()==0)
	{
		return "    - "+emp.getRole()+" ["+emp.getName()+"]\n";
	}
	String result="+ "+emp.getRole()+" ("+emp.getName()+")\n";
	for (Employee e: emp.getSubordinates()){
		result+=processHierarchy(e);
	}
	return result;
	}
	

}
