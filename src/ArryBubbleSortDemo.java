import java.io.*;

public class ArryBubbleSortDemo {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//create integer arry
		
		System.out.println("How many elements arry you want to create");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		//accept integer elements into arry
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter int: ");		
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		// use bubble sort
		
		int limit = n-1;
		boolean flag = false;
		int temp;
		for(int i=0; i<=limit;  i++)
		{
			for(int j=0; j<limit; j++)
			{
				// swap technique 
				
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			
			
			if(flag==false) break;
			else flag = false;
			
		}
		
		//display the sorter arry
		System.out.println("The Sorted arry is: ");
		for(int i=0; i<n; i++)
		System.out.println(arr[i]);	

		
	}

}
