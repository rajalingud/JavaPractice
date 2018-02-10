  class Teacher {

	String teachername = "Ramesh";
	String disignation = "BSC BED";
	void display()
	{
		System.out.println("Teaches Maths");
		
	}

} 

 class School extends Teacher {
	
	String Dept = "Maths";
		
	public static void main (String args[])
	{
		School obj = new School();
		System.out.println("Department = "+ obj.Dept);
		System.out.println("Teacher Name = "+ obj.teachername);	
		System.out.println("Qualification = "+obj.disignation);
		obj.display();
	}
	  
  }
