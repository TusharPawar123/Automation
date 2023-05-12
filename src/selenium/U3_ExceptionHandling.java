package selenium;

public class U3_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int a = 6;
		int b = 0;
		int c= a/b;  
	 	 	System.out.println(c); 
	} 
	 
	catch(ArithmeticException e) 
	{ 
	e.printStackTrace();  
	} 
	 	 
	finally 
	{ 
	 	System.out.println("Program is executed");  
	} 
	 	 
	 	 
	} 




	}


