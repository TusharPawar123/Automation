package selenium;

public class U2_ExeptionHandling {

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

}
}
