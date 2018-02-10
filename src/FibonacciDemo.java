import java.io.*;

public class FibonacciDemo {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("How many fibonacci?");
		int n = Integer.parseInt(br.readLine());
		
		long f1 =1, f2 =2;
		
		System.out.println("first fibonacci value = "+f1);
		System.out.println("second fibonacci value = "+f2);
		
		//find the next fibonacci
		
		long f = f1+f2;
		System.out.println("next fibonacci value = " + f);
		
		
		int count =3;
		while(count<n)
		{
			f1 = f2;
			f2 = f;
			f= f1+f2;
			System.out.println("next fibonacci value " +"(" +f1 +"+" +f2 +")" +" = " +f );
			count ++;
		}
		
	}

}
