package basics.programms;

public class Dog1 implements Cloneable {
Cat1 c;
int i;

Dog1()
{
	super();
}
Dog1(Cat1 c,int i)
{
this.c=c;
this.i=i;


}
@Override
protected Object clone() throws CloneNotSupportedException {
	Cat1 c1=new Cat1(c.j);
	Dog1 d1=new Dog1(c1,i);
	return d1;
	
}
}
