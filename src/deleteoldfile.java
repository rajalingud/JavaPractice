import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class deleteoldfile
	{
	    public static void main(String[] args) throws IOException
	    {
	    	
	    	String filename="8249_Appnexus Targetings Remove _creative_tags.csv";
	    	String home = System.getProperty("user.home");
	    	File filepath = new File(home+"/Downloads/"+filename); 
	        System.out.println(filepath);    	
	    	Files.deleteIfExists(Paths.get("/Users/rdasari/Downloads/8249_Appnexus Targetings Remove _creative_tags (1).csv"));
	      
	}

	}
