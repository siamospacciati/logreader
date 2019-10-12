package routine;

import java.io.File;

import utility.Utility;

public class Routine {

	public Routine() {
		// TODO Auto-generated constructor stub
	}
	
	// Read the log
	
	
	
	// Selects the type of log analyser (client, relay, server)
	public void selectAnalyser (int type) {
		
		switch(type) {
		  case 0:
		    // the type is not recognised
			  Utility.results("Error: the log type is unknown.", 0);
		    break;
		  case 1:
		    // client log
			  Utility.results("Client log", 0);
		    break;
		  case 2:
			// relay log
			  Utility.results("Relay log", 0);
			break;
		  case 3:
			// server log
			  Utility.results("Server log", 0);
			break;
		  default:
		    // this should not exists
			  Utility.results("Error: the type switch fell into the 'default' branch.", 0);
		}
		
		return;
		
	}
	
	
	
}
