package Array2;

public class AscendingOrder {
public static void main(String[] args) {
ascending();
}
public static void ascending()
{
	int[]x= {86,45,12,52};
	int len=x.length;
	for(int i=0;i<len-1;i++)
	{int min_idx=i;
		for(int j=i+1;j<len;j++)
		if(x[j]<x[min_idx])
			min_idx=j;
			
				int y=x[min_idx];
				x[min_idx]=x[i];
				x[i]=y;
				
		}
	for(int i=0;i<x.length;i++)
	{
	System.out.println(x[i]);
	}
}
}
