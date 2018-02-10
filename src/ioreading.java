import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ioreading {
	
	public static void main (String args[]) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Plz Enter a character ");
        String name = br.readLine();
        System.out.println("Entered values is "+ name);
        
	}

}
