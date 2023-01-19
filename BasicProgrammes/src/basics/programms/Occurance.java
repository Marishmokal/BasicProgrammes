package basics.programms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurance {
public static void main(String[] args) {
	int count=0;
	Pattern p=Pattern.compile("India");
	Matcher m=p.matcher("India is my country India having 29 states");
	while(m.find())
	{
		++count;
		System.out.println(m.start()+" "+m.end()+" "+m.group());
		
	}
	System.out.println("total number of occurance"+count);
}
}
