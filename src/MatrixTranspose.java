import java.io.*;
import java.util.*;

public class MatrixTranspose {
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		//accept rows & colums of arry
		 System.out.println("Enter rows and columns of Matrix (m x n) ?: ");
		 int row = sc.nextInt();
		 int col = sc.nextInt();
		 
		 //create array size
		  int arr[][] = new int[row][col];
		 
		 //accept a matric from keyboard
		 System.out.println("Enter elements of matrix m rows and n coulns: ");
		 
		 for(int i=0; i<row; i++) 
		 {
		   for(int j=0; j<col; j++) 
		    {
	          arr[i][j] = sc.nextInt();
	        
		    }
		 }
		 
		 
		 System.out.println("The matrix before Transpose is: ");		
		 for(int i =0; i<col; i++)
		 {
			 for(int j=0; j<row; j++)
			 {		
			 System.out.print(arr[i][j]+"  ");	
			 }
			 
			 System.out.println(" ");
		 } 
		 
			 
		 
		 // Transpose logic
		 System.out.println("The matrix after Transpose is: ");		
		 for(int i =0; i<col; i++)
		 {
			 for(int j=0; j<row; j++)
			 {		
			 System.out.print(arr[j][i]+"  ");	
			 }
			 
			 System.out.println(" ");
		 }
		 
		
	}

}
