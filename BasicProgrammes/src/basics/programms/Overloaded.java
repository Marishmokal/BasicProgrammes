package basics.programms;

public class Overloaded {
public static void message(double a,int b)
{
	System.out.println("long a and int b");
}
public static void message(int a, double b)
{
	System.out.println("int b and long a");
}
public static void main(String args[])
{
	message(10.5,11);
}
}
