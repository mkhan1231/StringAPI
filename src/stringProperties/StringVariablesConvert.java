package stringProperties;

public class StringVariablesConvert {

	public static void main(String[] args) {
	
		String str1 = "1234";
		System.out.println(str1);//Converting String to Integer
		int n1 = Integer.parseInt(str1);
		System.out.println(n1);
		
		//syso cntr+space+enter
		
		int n2 = 111;									//Converting int to String
		String str2 = String.valueOf(n2);
		System.out.println(str2);
		
		String str3="122.202";							//Converting String to Double
		double n3 = Double.parseDouble(str3);
		System.out.println(n3);
		
		double n4 = 99.9999;  							//converting double to string 
		String str4 = String.valueOf(n4);  
		System.out.println(str4); 

		String str5 = "FALSE";							//converting string to boolean, Upper case no problem
		boolean n5 = Boolean.parseBoolean(str5);
		System.out.println(n5);
		
		String str6 = "Hello";							//Converting String to char
		for(int i=0; i<str6.length();i++)
	    {
		char n6 = str6.charAt(i);
	    System.out.println("Character at "+i+" Position: "+n6);
	    }
	}
}


