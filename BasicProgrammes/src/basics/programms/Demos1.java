package basics.programms;
enum Beer1
{
	KF,KO,RC,FO;
}
public class Demos1 {
public static void main(String[] args) {
	Beer[]b=Beer.values();
	for(Beer b1:b)
	{
//		System.out.println(b1);//values()
		System.out.println(b1+"  "+b1.ordinal());//ordinal()
	}
}
}
