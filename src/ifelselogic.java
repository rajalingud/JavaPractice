import java.io.IOException;

class ifelselogic
{
	public static void main(String args[]) throws IOException
	{
		String name = "Raju";
		int age =30;
		
		if(age<=30)
		System.out.println(name+ " : is yong");
		
		else if(age<=50) 
		System.out.println(name+" : is middile aged");	
		
		else
		System.out.println(name+" : is old aged");

	}
}