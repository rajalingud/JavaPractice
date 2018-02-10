// Object demo
public class House {
   String address;
   String color;
   double are;
   void openDoor() {
      //Write code here
	   
	   System.out.println("Welcome to object1");
   }
   void closeDoor() {
      //Write code here
	   System.out.println("Welcome to object2");
   }
   public static void main(String[] args) {
	   {
		   House h=new House();
		   h.openDoor();
		   h.closeDoor();
	   }
}
}