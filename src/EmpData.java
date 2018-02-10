
import java.io.*;
public class EmpData {
	
	public static void main (String args[]) throws IOException
	{
		
		try{
	
		 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 
		 //Accept empoyee details
		 
		 System.out.println("Enter employee id : ");
		 int id = Integer.parseInt(br.readLine());
		 
		 System.out.println("Enter name of the employee :");
		 String name = br.readLine();
		 
		 System.out.println("Enter Sex of the employee (M/F) : ");
	//	 char sex  = (char)br.readLine()
		 char sex  = br.readLine().charAt(0);
		 
		 System.out.println("Enter employee rating in float : ");
		 float rating = Float.parseFloat(br.readLine());

		 System.out.println("Enter employee salary : ");
		 double sal = Double.parseDouble(br.readLine());
		 
		 System.out.println("Employee Id: "+ id);		
		 System.out.println("Employee Name: "+ name);
		 System.out.println("Employee Sex: "+ sex);
		 System.out.println("Employee Rating: "+ rating);
		 System.out.println("Employee Salary: "+ sal);
		 

		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		 
	}
}
 

