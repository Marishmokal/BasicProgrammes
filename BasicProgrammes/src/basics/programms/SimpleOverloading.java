package basics.programms;

public class SimpleOverloading
	{
	public void method1(int a) {
		System.out.println("inside int a");
	}

	public void method1(long i) {
		System.out.println("inside long i");
	}

	public void method1(Integer a) {
		System.out.println("inside Integer i");
	}

	public void method1(Long i) {
		System.out.println("inside Long i");
	}

	public static void main(String args[]) {
		SimpleOverloading s = new SimpleOverloading();
		s.method1(10);
	}
}
