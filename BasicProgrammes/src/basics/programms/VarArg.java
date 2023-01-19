package basics.programms;

public class VarArg {
public void test(int i)
{
	System.out.println("int i");
}
public void test(int...args)
{
	System.out.println("int varargs");
}
public void test(char...args)
{
	System.out.println("char varargs");
}
public static void main(String args[])
{
	VarArg v=new VarArg();
	v.test(10,20,30);
}
}
