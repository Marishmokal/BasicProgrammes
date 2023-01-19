package basics.programms;

public class Test16 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("abcdefghijklmnopkl");
	System.out.println(sb.capacity());
	sb.append("q");
	sb.append("abcdefghijklmnopkl");
	sb.append("q");
	System.out.println(sb.capacity());
	StringBuffer sb1=new StringBuffer("durga");
	System.out.println(sb1.capacity());
	 StringBuffer sb3=new StringBuffer("java");
	 sb3.setCharAt(0,'y');
	 System.out.println(sb3);
	 StringBuffer sb4=new StringBuffer("java is good langauge");
	 sb4.insert(2,"sun");
	 System.out.println(sb4);
	 StringBuffer sb5=new StringBuffer("abcdefgh");
	 sb5.delete(2,5);
	 System.out.println(sb5);
	 StringBuffer sb6=new StringBuffer("abcdefgh");
	 sb6.deleteCharAt(5);
	 System.out.println(sb6);
	 StringBuffer sb7=new StringBuffer("abcdefgh");
	 sb7.reverse();
	 System.out.println(sb7);
	 StringBuffer sb8=new StringBuffer("AishwaryaAbhi");
	 sb8.setLength(9);
	 System.out.println(sb8);
	 StringBuffer sb9=new StringBuffer();
	 System.out.println(sb9.capacity());
	 sb9.ensureCapacity(1000);
	 System.out.println(sb9.capacity());
	 
	 StringBuffer sb10=new StringBuffer(1000);
	 sb10.append("ABC");
	 System.out.println(sb10.capacity());
	 sb10.trimToSize();
	 System.out.println(sb10.capacity());
	 
	 StringBuilder db=new StringBuilder();
	 db.append("durga").append("solutions").reverse().insert(2,"xyz").delete(3,7);
	 System.out.println(db);

}
}
