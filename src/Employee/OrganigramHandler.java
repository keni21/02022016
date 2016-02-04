package Employee;


public class OrganigramHandler {
	
	public static String getChainOfCommand(Employee employee)
	{
		String ausgabe=employee.getName()+" ---> "+employee.getRole();
		
		if(employee.getSuperior()==null)
		{
			return ausgabe;
		}
		
		return ausgabe+" - "+getChainOfCommand(employee.getSuperior());
	}

	public static String processHierarchy(Employee emp) 
	{
		
		if(emp.getSubordinates().isEmpty())
		{
			return emp.getRole()+" "+emp.getName()+"\n";
		}
		
		String ausgabe="+"+emp.getName()+" ("+emp.getRole()+") \n";
		//indent+=" ";
		for (Employee employee : emp.getSubordinates()) 
		{	
			ausgabe+= processHierarchy(employee);
		}
		return ausgabe;
		
		/*String ausgabe=emp.getRole()+" "+emp.getName()+"\n";
		for (Employee employee : emp.getSubordinates()) 
		{
		ausgabe+=processHierarchy(employee);
		}
		return ausgabe;*/
	}
}
