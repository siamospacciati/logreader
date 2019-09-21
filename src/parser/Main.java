/**
 * 
 */
package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

/**
 * @author chicant
 *
 */


public class Main {

    public static void main(String[] args) throws IOException {
    	
    	//File f = new File("log.txt"); 
    	FileReader file = new FileReader(new File("log.txt"));
    	//Scanner sc = new Scanner(file);
    	BufferedReader b = new BufferedReader(file);
    	//List parola = new List();
    	String riga = b.readLine();
    	int i;
    	while (riga != null) {
    		System.out.println(riga);
    		String lista[]= riga.trim().split(" ");
    		riga = b.readLine();
    		for (i=0;i<5;i++) {
    		System.out.println(lista[i]);
    		}
    		
    	}
    	b.close();
    	
    	
    	//Calendar output = UTCHour()
    		
    }
    
    public static Calendar UTCHour(String ora,String fuso) {
    	
    	String Ora=ora;
    	String Fuso=fuso.substring(1);
    	int anno=2019;
    	int mese=9;
    	int giorno=21;
    	
    	String time[] = Ora.split(":");
    	String ore = Fuso.substring(0, 1);
    	String minuti = Fuso.substring(2);
    	
    	Calendar data = Calendar.getInstance();
    	data.set(anno,mese,giorno,Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2]));  	 	
    	
    	
    	return data;
    	
    }
}
