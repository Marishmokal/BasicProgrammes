package basics.programms;

public class FibonancySeries {
public static void main(String[] args) {
	int i=1;
	int a=0;
	int b=1;
	int c=0;
	for(i=1;i<=10;i++)
	{
		c=a+b;
		a=b;
		b=c;
	}
	System.out.println(+c);
}
}
