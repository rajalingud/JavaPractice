import java.io.IOException;

//ConstructorDemo

public class Person {
	
	// instance variables
	private String name;
	private int age;
	
	//defaut constructor
	Person()
	{
		name = "Rajalingu";
		age = 30;		
	}

	//parameterized constructor
	Person(String s, int i)
	{
		name = s;
		age = i;		
	}
	
	//Method
	void talk()
	{
		System.out.println("Hello my name is : " +name);
		System.out.println("Hello my name is : " +age);
	}

}

class example
{
	public static void main(String args[]) throws IOException
	{
		Person Raju = new Person();
		Raju.talk();
		
		Person Pragna = new Person();
		Pragna.talk();
	}
}