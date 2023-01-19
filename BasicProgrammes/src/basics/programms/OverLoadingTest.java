package basics.programms;


class A
{
	
}
class B extends A
{
	
}
class C extends B
{
	
}
class OverLoadingScenarios
{
	void m1(A a)
	{
		System.out.println("i m in m1 of A");
	}
	void m1(B b)
	{
		System.out.println("i m in m1 of B");
	}
	void m1(C c)
	{
		System.out.println("i m in m1 of C");
	}
}
public class OverLoadingTest
{
	public static void main(String args[])
	{
		OverLoadingScenarios obj = new OverLoadingScenarios();
		//A a=new A();
		//obj.m1(a);
		//B b=new B();
		//obj.m1(b);
		//C c=new C();
		//obj.m1(c);
		//B bc=new C();
		//obj.m1(bc);
		A ab=new B();
				obj.m1(ab);
	}
}

