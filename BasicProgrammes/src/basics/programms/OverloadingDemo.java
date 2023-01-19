package basics.programms;

public class OverloadingDemo {
	public static void display(int a) {
		System.out.println("int a");
	}
	public static void display(long a) {
		System.out.println("long a ");
	}

	public static void display(Float a) {
		System.out.println("float a ");
	}
	public static void display(String a)
	{
		System.out.println("String a" );
	}
	public static void display(Number a)
	{
		System.out.println("Number a" );
	}
	public static void display(Object a)
	{
		System.out.println("Object a" );
	}
	public static void display(char a)
	{
		System.out.println("char a" );
	}
	public static void main(String[] args) {
		// OverloadingDemo o=new OverloadingDemo();
		// o.display(1);
		display(1);
	}
}
