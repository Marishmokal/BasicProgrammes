package basics.programms;

import java.util.StringTokenizer;

public class Regex4 {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("19-09-2014","-");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
