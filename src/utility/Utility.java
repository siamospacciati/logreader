package utility;
import java.io.File;

public class Utility {
	// Utility static methods
	
	// Method that recognises among the types of log (client => 1, relay => 2, server => 3)
	public static int FileType (File f) {
		int type = 0;
		String file_name =f.getName();
		
		if (file_name.contains("BESRelay")) type = 3;
		else if (file_name.contains("logfile")) type = 2;
		else if (file_name.startsWith("20")) type = 1;
		else return type;
		
		return type ;
	}
	
	

}
