package basics.programms;

public class MethodCalling {
	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
		System.out.println("Main method ended");
	}

	private static void method1() {
		System.out.println("Method 1 started");
		method2();
		System.out.println("Method 1 ended");
	}

	private static void method2() {
		System.out.println("method 2 started");

		System.out.println("method 2 ended");
	}
}
