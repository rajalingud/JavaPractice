import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class StrTokenizerDemo {
	
	public static void main(String args[]) throws IOException
	{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Plz enter emp_id, emp_name, emp_sex, emp_rating,emp_salary with comma seperation");	
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		String s5 = st.nextToken();
		
		
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		s4 = s4.trim();
		s5 = s5.trim();
		
	   int id = Integer.parseInt(s1);
	   String name = s2;
	   String sex  = s3;
	   float rating = Float.parseFloat(s4);
	   Double sal = Double.parseDouble(s5);	
	   
	   System.out.println("Emp_id: "+s1);
	   System.out.println("Emp_name: "+s2);
	   System.out.println("Emp_sex: "+s3);
	   System.out.println("Emp_rating: "+s4);
	   System.out.println("Emp_salary: "+s5);
		
		
	}

	private static int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
