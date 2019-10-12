import java.io.File;

import routine.Routine;
import utility.Utility;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		File log = new File("20191012.log");
		int type = Utility.FileType (log);
		System.out.println(type);
		Routine r = new Routine();
		r.SelectAnalyser(type);
		
		return;		
	}

}
