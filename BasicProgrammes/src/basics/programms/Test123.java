package basics.programms;//UPCASTING AND DOWNCASTING


class Parent
{
	void m1()
 {
	 System.out.println("parent method");
 }
 
}
class Child extends Parent
{
	 {
		 System.out.println("Child method");
	 }
	
}
public class Test123
{

	public static void main(String[] args) {
//	Parent p=new Parent();
//	((Child)p).m1(); // child c = new Parent();
		
		Child c=new Child();
		((Parent)c).m1();  // Parent p = new child ()
		
		Parent p1=new Child();
		((Child)p1).m1(); //  Child c = new child
		
		//Child c1=(Child) p;  // Child c1 = new Parent();
		Child c1=(Child) p1;  // Child c1 = new Child();
		c1.m1();
		
	}
}
