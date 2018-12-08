package stringProperties;

public class StringMethods1 {

	public static void main(String[] args) {
		String str1="Beginners";
		System.out.println(str1);
		//String Concate
		
		str1= str1.concat("Book").concat(".").concat("com");
		System.out.println(str1);
		
		String str2 = new String("ABC IS NOT EQUAL TO XYZ");	//Converting uppercase to lowercase
	    System.out.println(str2.toLowerCase());
	    
	    String str3 = new String("this is a test string");		//Converting lowercase to uppercase      
	    System.out.println(str3.toUpperCase());
	    
	    String str4 = new String("    How are you??   ");		//Trim method removes leading and trailing space from string literal
	    System.out.println("String before trim: "+str4);
	    System.out.println("String after trim: "+str4.trim());
	    
	    String str5= new String("Test String");
	    System.out.println("Length of str5:"+str5.length());
	    
	    
	    String str6 = "Cristiano Ronaldo";						//returns the index of occurrence of character t
	    System.out.println("index of letter 'c' = " 
	         + str6.indexOf('c')); 
	    System.out.println("index of letter 'e' = " 			 // returns -1 as character e is not in the string
	         + str6.indexOf('e'));

	}

}
