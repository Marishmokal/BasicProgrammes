package basics.programms;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int num;
	int count=0;
	Scanner m=new Scanner(System.in);
System.out.println("enter any number");
num=m.nextInt();
for(int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		count++;
    }
}
if(count==2)
	System.out.println("prime number");
else
	System.out.println("not prime number");
	
}
}
