package Array2;
class ArrayAddition
{
	public static void addition(int[]z,int[]c)
	{
		int[]y=new int[z.length];
		for(int i=0;i<z.length;i++)
		{
			y[i]=z[i]+c[i];
		}
		for(int i=0;i<z.length;i++)
		{
			System.out.println(y[i]);
		}
		
	}
}
public class AdditionOfArray {
public static void main(String[]args) {
	int[]z= {5,4,3};
	int[]c= {5,4,3};
	ArrayAddition.addition(z,c);
	if(z.length != c.length)
	{
		System.out.println("arrays must be same");
		
	
}
}
}
