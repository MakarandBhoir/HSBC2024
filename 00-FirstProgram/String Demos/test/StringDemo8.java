package test;

public class StringDemo8 {

	public static void main(String[] args) {
		String str = "HelloWorld";
		String str2 = "98212256991";
		String str3 = "Makarand Bhoir";
		String str4 = "makarand@gmail.com";
		
		// Whether string contains only alphabets
		System.out.println(str.matches("[a-zA-Z]+"));
		
		// string contains valid mobile number
		// 10 digit number - 1234567890 - valid / 123456789 - invalid / 12345678901 - invalid
		System.out.println(str2.matches("[0-9]{10}"));
		
		// string contains full name  - Makarand Bhoir - valid / MakarandBhoir - invalid / Makarand - invalid
		System.out.println(str3.matches("[a-zA-Z]+ [a-zA-Z]+"));
		
		
		// string contains valid email - makarand@gmail.com - valid / makarand - invalid / makarand@.com - invalid
		System.out.println(str4.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+"));
		
	}

}
