package Array2;

public class AverageOf {
public static void main(String[] args) {
	int[]x= {12,15,22,42,48};
	int n=x.length;
	average(x,n);
}
public static void average(int[]x,int n)
{
	int add=0;
	for(int i=0;i<x.length;i++)
	{
		add=add+x[i];
	}
	System.out.println(add/5);
}
}
