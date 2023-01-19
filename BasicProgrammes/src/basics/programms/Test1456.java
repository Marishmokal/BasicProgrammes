package basics.programms;

class X
{
void m1(X a)
{
	System.out.println("X");
}
}
class Y extends X
{
void m1(Y b)//UPCASTING AND DOWNCASTING
{
	System.out.println("Y ");
}
}
class Z extends Y
{
void m1(Z c)
{
	System.out.println("Z ");
}
}

public class Test1456 
{
public static void main(String args[])
{
	X x =new X();
	Y y=new Y();
	Z z=new Z();
	
	((Z)z).m1(y);// Z z1=new Z(); m1(Y y);
	((Z)x).m1(x);//Z z2=new X(); m1(X x);
	((Z)y).m1(z);//Z z3=new Y();m1(Z z);
}
}
