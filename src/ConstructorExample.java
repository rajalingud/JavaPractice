
public class ConstructorExample {
	int age;
	String name;
	
	ConstructorExample()
	{
		this.age= 9;
		this.name ="Raju";
	}
	
	ConstructorExample(String n, int a)
	{
		this.name =n;
		this.age=a;
	}

	public static void main(String []args)
	{
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = new ConstructorExample("Mahen", 6);
		
		System.out.println(obj1.name +"  "+ obj1.age);
		System.out.println(obj2.name +"  "+ obj2.age);
	}
}
