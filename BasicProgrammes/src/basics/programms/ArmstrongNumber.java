package basics.programms;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num,r;
	int c=0;
	int arm=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	num=s.nextInt();
	c=num;
	
while(num>0)
{
	r=num%10;
	arm=(r*r*r)+arm;
	num=num/10;
}
if(c==arm)
	System.out.println("Armstrong number");
else
	System.out.println("not Armstrong number");
}
}
