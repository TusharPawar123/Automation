package selenium;

public class U4_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 	 	try {
 	 		 int a = 6;
 	 	     int b = 0;   	 	 	
 	 	     int c= a/b;  
 	 	 	System.out.println(c); 
 	 	} 
 	 	 
 	 	 
 	 	catch
 	 	(ArithmeticException e){ 
 	 		e.printStackTrace(); 
 	 	} 
 	 	 
 	 	catch(Exception e) { 
 	 	 	e.printStackTrace(); 
 
 	 	} 
 	  	 	 
 	 	finally 
 	 	{ 
 	 	 	System.out.println("Hi E");  
 	 	} 
 	 	 
 	 	 
 	} 
 


	}


