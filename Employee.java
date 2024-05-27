public class Employee
{
	private String name, department, position;
	private int idNumber;

	public Employee ()
	{
		name = null;
		department = null;
		position = null;
		idNumber = 0;
	}

public Employee (String name, String department, String position, int idNumber)
	{
		this.name = name;
		this.department = department;
		this.position = position;
		this.idNumber = idNumber;
	}

	String getName()
	{
		return name;
	}

	String getDept()
	{
		return department;
	}

	String getPost()
	{
		return position;
	}

	int getIdNum()
	{
		return idNumber;
	}
}





EmployeeTest.java
import java.util.ArrayList;

class EmployeeTest
{
	public static void main (String [] a)
	{
	Employee emp1 = new Employee ("Dr Nor Sabrina", "Accounting", "Vice President", 47899);
	Employee emp2 = new Employee ("En Ahmad", "IT", "Programmer", 39119);
	Employee emp3 = new Employee ("Prof M Izzudin", "Consultation", "Manager", 66666);

		
//Q1 : Declare ArrayList for Employee



//Q2 : Invoke add method to populate the list with 3 employee objects emp1,emp2 and emp3 

	
		
//Q3 : Print the information of all elements of  the list
// Can we use toString() method in this program ?
	
}
} {
    
}
