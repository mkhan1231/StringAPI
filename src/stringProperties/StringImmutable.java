package stringProperties;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "Ronaldo";
		System.out.println(str);
		
		str = "Messi";
		System.out.println(str);
		
		//By seeing the above code we would say that the value of str has changed 
		//so how can it be immutable? Let me explain this:In first statement an object 
		//is created using string literal “Ronaldo”, in second statement when we assigned 
		//the latest string literal “Messi” to str, the object itself didn’t change instead 
		//a new object got created in memory using string literal “Messi” and the reference to 
		//it is assigned to str. So basically both the objects “Ronaldo” and “Messi” exists in memory
		//having different references(locations).
		
		
	}

}
