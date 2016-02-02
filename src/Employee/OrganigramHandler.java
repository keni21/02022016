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

/*	public static String processHierarchy(Employee emp) {
		
		if(emp)
		
		}*/
}
