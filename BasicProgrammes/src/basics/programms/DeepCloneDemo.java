package basics.programms;

public class DeepCloneDemo   {
public static void main(String[] args)throws CloneNotSupportedException {
	Cat1 c=new Cat1(10);
	Dog1 d=new Dog1(c,20);
	System.out.println(d.i+" "+d.c.j);
	Dog1 d1=(Dog1)d.clone();
	d1.i=888;
	d1.c.j=999;
	System.out.println(d.i+" "+d.c.j);
}
}
