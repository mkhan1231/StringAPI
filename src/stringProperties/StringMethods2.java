package stringProperties;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String str1 = "This is Juventus";              				//Substring method to get value of String from a certain point
	    System.out.println(str1);
		String substr = "";	    
	    substr = str1.substring(7);
	    System.out.println("substring = " + substr);

	    
	    String s1="Cristiano Ronaldo";  							//Compare String
	    String s2="Cristiano Ronaldo";  
	    String s3="Neymer";  
	    System.out.println(s1.compareTo(s2));						//0  
	    System.out.println(s1.compareTo(s3));						//-11(because s1>s3)  
	    System.out.println(s3.compareTo(s1));						//11(because s3 < s1 ) 
	}

}
