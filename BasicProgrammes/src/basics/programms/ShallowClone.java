package basics.programms;

public class ShallowClone {
public static void main(String[] args)throws CloneNotSupportedException {
	Cat c=new Cat(20);
	Dog d=new Dog(c,10);
	System.out.println(d.i+" "+d.c.j);
	Dog d1=(Dog)d.clone();
	d1.i=888;
	d1.c.j=999;
	System.out.println(d.i+" "+d.c.j);
	
	
}
}
