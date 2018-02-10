import java.io.*;
public class LeapYearDemo {

 

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Year");
		
		for (int i=0; i<=5; i++)
		{
		
		int year = Integer.parseInt(br.readLine());
		

		if(year % 100 ==0 && year % 400 ==0)
		System.out.println(year + " is leap year" + "\n");
		else if(year % 100 !=0 && year % 4 ==0)
		System.out.println(year + " is leap year");
		else System.out.println(year + " is not a leap year" + "\n");
		
		System.out.println("Enter one more year to test");

		}
		 
	
		 
	}
}
