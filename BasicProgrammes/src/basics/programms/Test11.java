package basics.programms;

public class Test11 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("durga");
	String str1=sb.toString();
	//String str2=new String(str1);
	String str2=str1;
	//String str2="durga";
	//String str2=sb.toString();
	System.out.println(str1==str2);
}
}
