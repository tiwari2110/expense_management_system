import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		 try{    
			 String csvfile = "C:\\Users\\akatiwar.I-FLEX\\Downloads\\Internal Job Posting 15Jun17.xlsx";
			 String filename = "C:\\Users\\akatiwar.I-FLEX\\Desktop\\MyText.out";
	           FileWriter fw=new FileWriter(filename,false);    
	           fw.write(csvfile);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    

}
