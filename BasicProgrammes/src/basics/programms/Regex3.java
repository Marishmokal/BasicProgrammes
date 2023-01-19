package basics.programms;

import java.util.regex.Pattern;

public class Regex3 {
public static void main(String[] args) {
	int count=0;
	Pattern p=Pattern.compile("\\.");
	String []s=p.split("www.durgajobs.com");
	for(String s1:s)
	{
		
		System.out.println(s1);
	}
}
}
