package basics.programms;

public class NullTest {
	public static void method(Object a, Object b) {
		System.out.println("object a");
	}

//	public static void method(String a, Object b) {
//		System.out.println("String a,Object a");
//	}

	public static void methos(StringBuffer a) {
		System.out.println("Stringbuffer");
	}

	public static void method(StringBuilder a) {
		System.out.println("StringBuilder a");
	}

	public static void main(String args[]) {
		method(null, null);
	}
}
