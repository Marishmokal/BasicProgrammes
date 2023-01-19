package basics.programms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
public static void main(String[] args) {
	int count=0;
	Pattern p=Pattern.compile("bbb");
	Matcher m=p.matcher("abbabbba");
	while(m.find())
	{
		count++;
		System.out.println(m.start()+" "+m.end()+" "+m.group());
	}
	System.out.println("total number of occurances"+count);
	
}
}
