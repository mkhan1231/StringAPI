package stringProperties;
		

public class StringMethods3 {
	
	

	public static void main(String[] args) {
		String imp="12345-6789";
		
		String str1= "mahmud@gmail.com";                           					//getting characters before '@'
		System.out.println(str1.substring(0, str1.indexOf("@")));
		
		System.out.println(str1.substring(str1.indexOf("@")+1,str1.length()));
		
		System.out.println(imp.substring(1, imp.indexOf("4")));
		System.out.println(imp.substring(imp.indexOf("-")+1,imp.length()));
		
		
		
	}

}
