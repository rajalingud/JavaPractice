
import java.io.*;
public class palindromedemo {
	
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		String name = br.readLine();
		String tempName = name;
		
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		name=sb.toString();
		
		if(tempName.equalsIgnoreCase(name))
		System.out.println(name + " :  is palindrome");
		else	
		System.out.println(name + " : is not a palindrome");
					
		
	}

}
