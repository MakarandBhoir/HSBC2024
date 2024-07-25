
public class IsBlankDemo {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "  ";
		String str3 = "Hello";
		System.out.println("Is the string blank? " + str1.isBlank());
		System.out.println("Is the string blank? " + str2.isBlank());
		System.out.println("Is the string blank? " + str3.isBlank());

	}

}
