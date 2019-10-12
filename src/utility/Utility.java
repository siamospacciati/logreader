package utility;
import java.io.File;

public class Utility {
	// Utility static methods
	
	// Method that recognises among the types of log (client => 1, relay => 2, server => 3)
	public static int fileType (File f) {
		int type = 0;
		String file_name =f.getName();
		
		if (file_name.contains("BESRelay")) type = 3;
		else if (file_name.contains("logfile")) type = 2;
		else if (file_name.startsWith("20")) type = 1;
		else return type;
		
		return type ;
	}
	
	// Because a Chiara je pesa er culo (ma diventerà il metodo per loggare tutto su un file :) )
	public static void results(String s, int i) {
		if (i == 0 && s == "") {
			System.out.println("No values were received or they are empty string and 0");
		} else if (i != 0 && s == "") {
			System.out.println("The values received is "+ i +" and empty string");
		} else if (i == 0 && s != "") {
			System.out.println(s);
		} 
	}

}
