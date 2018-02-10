
public class StringStringBufferStringBuilderDemo {
	
	// Concatenates to String
	public static void concat1(String s1)
	{
		s1 = s1 + " Dasari";		
	}
	
	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2)
	{
		s2.append(" Dasari");
	}
	
	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3)
	{
		s3.append(" Dasari");
	}
	
	public static void main(String args[])
	{
		String s1 = "Rajalingu";
		concat1(s1);
		System.out.println("String Result : " + s1);
		System.out.println();
		
		StringBuilder s2 = new StringBuilder("Rajalingu");
		concat2(s2);
		System.out.println("StringBuilder Result : " + s2);
		System.out.println();

		StringBuffer s3 = new StringBuffer("Rajaling");
		concat3(s3);
		System.out.println("StringBuffer Result : "+s3);
		System.out.println();	
		
		System.out.println(".........................................................");
		
		
		System.out.println("Conversion from String object to StringBuffer: ");	
		String str = "Rajalingu";
		StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);	
        System.out.println();
        		
        System.out.println("Conversion from String object to StringBuilder: ");
        StringBuilder sbl = new StringBuilder(str);
        sbl.append(" Dasari");
        System.out.println(sbl);
        System.out.println();
		
		
        
        System.out.println("Conversion from StringBuffer object to String: ");
        StringBuffer sbr1 = new StringBuffer("Rajalingu from strigbuffer object");       
        String str1store = sbr1.toString();
        System.out.println(str1store);
        System.out.println();
		
        System.out.println("Conversion from StringBuilder object to String: ");
        StringBuilder sbr2 = new StringBuilder("Rajalingu from stringbuilder object");
        String str2store = sbr2.toString();
        System.out.println(str2store);
        System.out.println();
		
	
		
	}
		

}
