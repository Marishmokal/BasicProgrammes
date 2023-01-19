package basics.programms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
public static void main(String[] args) {
	int count=0;
	Pattern p=Pattern.compile("is");
	Matcher m=p.matcher("java is interpretes langauge it is best now a days");
	while(m.find())
	{
		count++;
		System.out.println(m.start());
	}
	System.out.println("total number of occurances"+count);
}
}
