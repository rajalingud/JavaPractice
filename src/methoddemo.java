
public class methoddemo {
	
	
	static int myMethod(int num)
	{
		
		return num*num;
	}
	
	public static void main(String args[])
	{
		 int resultval = methoddemo.myMethod(5);
		 System.out.println("Result is " + resultval);
		 System.err.println("Result is " + resultval);
	}

}
