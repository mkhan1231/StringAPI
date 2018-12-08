package stringProperties;

public class StringConstructor {

	public static void main(String[] args) {		
		
		
		    String str1 = new String();                       		// using 1st default constructor
		    System.out.println("1st constructor: " + str1);   		// does not print any value

		    String str2 = new String("Second constructor");   		// using 2nd constructor
		    System.out.println("2nd constructor: " + str2);   		// prints Second constructor     

		    char charArray1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		    String str3 = new String(charArray1);             		// using 3rd constructor
		    System.out.println("3rd constructor: " + str3);   		// prints abcdefgh    
		   
		    String str4 = new String(charArray1, 0, 3);       		// using 4th constructor
		    System.out.println("4th constructor: " + str4);   		// prints  abcdef, from 1 onwards 6 characters

		    int intArray1[]={65, 66, 67, 68, 69, 70, 71, 72}; 		// ASCII numbers are converted to characters implicitly
		    String str5 = new String(intArray1, 1, 6);        		// using 5th constructor
		    System.out.println("5th constructor: " + str5);   		// prints BCDEFG   

		    byte bytetArray1[] = {65, 66, 67, 68, 69, 70, 71, 72}; 	// ASCII numbers are converted to characters implicitly
		    String str6 = new String(bytetArray1);            		// using 6th constructor
		    System.out.println("6th constructor: " + str6);  		// prints ABCDEFGH
		   
		    String str7 = new String(bytetArray1, 1, 6);      		// using 7th constructor
		    System.out.println("7th constructor: " + str7);   		// prints BCDEFG   

		    StringBuffer sb1 = new StringBuffer("Ronaldo");
		    String str8 = new String(sb1);		      				// using 8th constructor
		    System.out.println("8th constructor: " + str8);   		// prints ROnaldo    

		    StringBuilder sb2 = new StringBuilder("Messi");
		    String str9 = new String(sb2);		      				// using 9th constructor
		    System.out.println("9th constructor: " + str9);  		// prints Messi
		 }
		
		
}


