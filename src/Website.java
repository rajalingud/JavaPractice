// class demo

public class Website{
	// instance variables
	
	String webName;
	int webAge;
	
	// constructor
	Website(String name, int age)
	{
		this.webName = name;
		this.webAge = age;
	}


public static void main (String args[])
{
	//Creating objects with data
	Website obj1 = new Website("Learning book", 5);
	Website obj2 = new Website("Practice book", 10);
	
	//Accessing object data with reference
	
	System.out.println(obj1.webName+" "+obj1.webAge);
	System.out.println(obj2.webName+" "+obj2.webAge);
}
}