package basics.programms;

public class StringDot {
	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		System.out.println(a == b);
		
		ABC z1 = new ABC();
		ABC z2 = new ABC();
		
		System.out.println(z1.Add(10,20));
		System.out.println(z2.Add(20,10));
		
		System.out.println(z1);
		System.out.println(z2);
		
	}
}
class ABC{
   int Add(int x, int y) {
		return x+y ;
	}
}
