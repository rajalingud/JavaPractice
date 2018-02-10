import java.io.*;
public class Employee {
	
	//instance variablaes
	int id;
	String name;
	
	//to store data
	Employee(int i, String n)
	{
		id =i;
		name=n;
	}
	
	// method to display data
	void displayData()
	{
		
	System.out.println(id+"\t"+name);
	
	}
}

class Group
{
	public static void main(String args[]) throws IOException
	{
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//create employee type arry with size 5
		Employee arr[]=new Employee[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter id: ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter name: ");
			String name = br.readLine();
			
			arr[i] = new Employee(id, name);
			
		}
		
		System.out.println("The Employee Data is: ");
		// Display the Employee data from the array
		for(int i=0; i<arr.length;i++)
		{
			arr[i].displayData();
		}
	}
	
}