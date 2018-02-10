import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


	 class Methodargdemo {
		
		//Instance variables	
		private String name;
		private int age;
		
		//Parameterized constructor	
		Methodargdemo(String s, int i) 
		{
			
			name =s;
			age =i;
			
			
		}
		
		//Method
		public void check()
		{
			if(age<=30)
			System.out.println(name+ " : is yong");
			
			else if(age<=50)
			System.out.println(name+" : is middile aged");	
			
			else
			System.out.println(name+" : is old aged");
			
		}
	}

	class Argddemo
	{
		public static void main(String args[]) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = args[0];
			int i = Integer.parseInt(args[1]);
			
			methoddemo1 m = new methoddemo1();
			m.check();
			
		}
	}