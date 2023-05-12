package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class U1_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
 	 	 	FileInputStream fis = new FileInputStream("D:/abc.text"); 
 	 	 	System.out.println(fis);  
 	 	} 
 	 	catch (FileNotFoundException e) {
 	 		e.printStackTrace(); 
 	 	}  
 	 	 
 	} 
 

 

	}


