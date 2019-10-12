import java.io.File;
import java.io.IOException;

import routine.Routine;
import utility.Utility;

public class Main {

	public static void main(String[] args) throws IOException {
		//File log = new File("20191012.log");
		
		File[] files = new File("./src/input").listFiles();
		File log = files[0];
		Utility.results("Log name: "+log.getName(), 0);
		int type = Utility.fileType(log);
		Utility.results("", type);
		Routine r = new Routine();
		r.selectAnalyser(type);
		
		return;
	}

}
