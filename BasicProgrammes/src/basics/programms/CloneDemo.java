package basics.programms;

public class CloneDemo implements Cloneable{
int i=20;
int j=30;

public static void main(String args[])throws CloneNotSupportedException
{
	int i=45;
	int j=10;
	CloneDemo c=new CloneDemo();
	CloneDemo c1=(CloneDemo)c.clone();
	
	System.out.println(c.i+" "+c.j);
	System.out.println(c1.i+" "+c1.j);
	
}
}
