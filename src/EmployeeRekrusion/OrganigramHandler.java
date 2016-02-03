package EmployeeRekrusion;

public class OrganigramHandler {
	
	public static String getChainOfCommand(Employee employee)
	{
		if(employee.getSuperior()==null)
		{
			return employee.getName()+" ["+employee.getRole()+"]";
		}
		return employee.getName()+" ["+employee.getDepartment()+"] \n"+getChainOfCommand(employee.getSuperior());
		
	}


	public static String ProcessHierachy(Employee employee, String indent)
	{
		
		if(employee.getSubordinates().isEmpty())
		{
			
			return indent+"-"+employee.getName()+" ["+employee.getRole()+"] \n";
		}
			String ausgabe=indent+"+"+employee.getName()+" ("+employee.getRole()+") \n";
			indent+=" ";
			for (Employee emp : employee.getSubordinates()) 
			{	
				ausgabe+= ProcessHierachy(emp,indent);
			}
			return ausgabe;
		
	}
}
