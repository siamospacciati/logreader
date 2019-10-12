package routine;

import java.io.File;

public class Routine {

	public Routine() {
		// TODO Auto-generated constructor stub
	}
	
	// Read the log
	
	
	
	// Selects the type of log analyser (client, relay, server)
	public void SelectAnalyser (int type) {
		
		switch(type) {
		  case 0:
		    // the type is not recognised
			  System.out.println("Error: the log type is unknown.");
		    break;
		  case 1:
		    // client log
			  System.out.println("Client log");
		    break;
		  case 2:
			// relay log
			  System.out.println("Relay log");
			break;
		  case 3:
			// server log
			  System.out.println("Server log");
			break;
		  default:
		    // this should not exists
			  System.out.println("Error: the type switch fell into the 'default' branch.");
		}
		
		return;
		
	}
	
	
	
}
