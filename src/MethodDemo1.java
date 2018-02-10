import java.io.*;

 class methoddemo1 {
	
	//Instance variables	
	private String name;
	private int age;
	
	//Parameterized constructor	
	public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		name = br.readLine();
		
		System.out.println("Enter age");
		age =Integer.parseInt(br.readLine());
		
		
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

class Demonew
{
	public static void main(String args[]) throws IOException
	{
			
		methoddemo1 m = new methoddemo1();
		m.accept();
		m.check();
		
	}
}