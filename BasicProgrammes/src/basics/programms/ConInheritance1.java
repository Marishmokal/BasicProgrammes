package basics.programms;

class One
{
	int n1;
	One(int x)
	{
		n1=x;
	}
	void show()
	{
		System.out.println("value of n1 is:-"+n1);
	}
}
class Two extends One
{
	int n2;
	Two(int x,int y)
	{
		super(x);
		n2=y;
	}
	void disp()
	{
		System.out.println("value of n2:-"+n2);
	}
	
}
public class ConInheritance1
{
	public static void main(String args[])
	{
		Two t=new Two(400,700);
		t.show();
		t.disp();
	}
}

