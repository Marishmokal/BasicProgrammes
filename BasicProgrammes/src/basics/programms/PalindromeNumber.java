package basics.programms;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	int num,r,c,s=0;
	Scanner g=new Scanner(System.in);
	System.out.println("enter any number");
	num=g.nextInt();
	c=num;
	while(num>0)
	{
		r=num%10;
		s=s*10+r;
		num=num/10;
	}
	if(c==s)
	{
		System.out.println("Palindrome number");
	}
	else
		System.out.println("Not palindrome number");
}
}
