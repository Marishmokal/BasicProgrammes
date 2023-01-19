package basics.programms;

import java.util.Scanner;

public class TwoDiaArray2 {
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		int[][]x=new int[3][3];
		int[][]y=new int[3][3];
		int [][]z=new int[3][3];
		for( i=0;i<=2;i++)
		{
			for(j=0;j<=2;i++)
			{
				System.out.println("\n\t Enter 1st arr value");
				x[i][j]=sc.nextInt();
				
				
			}
		}
		for( i=0;i<=2;i++)
		{
			for(j=0;j<=2;i++)
			{
				System.out.println("\n\t Enter 2st arr value");
				y[i][j]=sc.nextInt();
				
				
			}
		}
		System.out.println("\n\t Values from 2D arrys are");
		for(i=0;i<=2;i++)
		{
			for( j=0;j<=2;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
				System.out.println(z[i][j]);
			}
			
		}
	}
}
