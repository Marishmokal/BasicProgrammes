package basics.programms;//UPCASTING N DOWNCASTING

class SuperParent
{
void m1(SuperParent a)
{
	System.out.println("AA ");
}
}
class Parent1 extends SuperParent
{
void m1(Parent1 b)
{
	System.out.println("AB ");
}
}
class Child1 extends Parent1
{
void m1(Child1 c)
{
	System.out.println("AC ");
}
}

public class Test145 {
	public static void main(String[] args) {
		SuperParent x=new SuperParent();
		Parent1 y=new Parent1();
		Child1 z = new Child1();
		
		x.m1(z); // x.m1(child1 z)
		y.m1(x); // y.m1(superParent x)
		z.m1(y); // z.m1(Parent1 y)
		
		
		x.m1(y); // x.m1(Parent y)
		y.m1(z); // y.m1(Child z)
		z.m1(z); // z.m1(Child z)
		
	}

}
