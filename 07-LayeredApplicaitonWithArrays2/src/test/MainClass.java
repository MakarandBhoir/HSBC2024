package test;

class First
{ 
	public First(int a) { System.out.println("a"); }
}
class Second extends First 
{ 
	public Second() { super(100); System.out.println("b"); }
}
class Third extends Second 
{ 
	public Third() { System.out.println("c"); } 
}
public class MainClass 
{ 
	public static void main(String[] args) 
	{ 
		Third c = new Third(); 
	} 
} 
