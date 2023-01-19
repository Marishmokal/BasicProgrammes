package basics.programms;

public class GenDemo {
public static void main(String[] args) {
	Gen <String> g1=new Gen <String>("durga");
	g1.show();
	System.out.println(g1.getob());
	
	Gen<Integer> g3=new Gen<Integer>(10);
	g3.show();
	System.out.println(g3.getob());
	
	Gen<Double>g2=new Gen<Double>(5.5);
	g2.show();
	System.out.println(g2.getob());
	
	
	Gen<Character>g4=new Gen<Character>('j');
	g4.show();
	System.out.println(g4.getob());
	
}
}
