package basics.programms;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterDemo1 {
public static void main(String[] args) {
	ArrayList s=new ArrayList();
	s.add("balkrishna");
	s.add("venky");
	s.add("chiru");
	s.add("nag");
	System.out.println(s);
	ListIterator l=s.listIterator();
	//System.out.println(l.getClass().getName());
	while(l.hasNext())
	{
		String j=(String)l.next();
		if(j=="venky")
		{
			l.remove();
		//	System.out.println(s);
		}
		else if(j=="nag")
		{
			l.add("chaitu");
			//System.out.println(s);
		}
		else if(j=="balkrishna")
		{
			l.set("marish");
			System.out.println(s);
		}
	}
}
}
