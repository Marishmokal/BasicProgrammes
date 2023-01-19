package basics.programms;

public class Test12 {
public static void main(String[] args) {
	String ta="a";
	 ta=ta.concat("b");
	 String tb="c";
	 ta=ta.concat(tb);
	 ta.replace('c','d');
	 ta=ta.concat(tb);
	 System.out.println(ta);
	
}
}
