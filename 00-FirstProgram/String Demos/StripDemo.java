
public class StripDemo {

	public static void main(String[] args) {
		String fname = "   virat   ";
		String lname = "   kohali   ";
		
		System.out.println(fname);
		System.out.println(fname.strip());
		System.out.println(fname.stripTrailing()+" "+lname.stripLeading());

	}

}
