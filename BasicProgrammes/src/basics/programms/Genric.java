package basics.programms;

import java.util.ArrayList;

public class Genric {
public static void main(String[] args) {
	ArrayList<String>l=new ArrayList<String>();
	int m1;
	l.add("ram");
	l.add("sham");
	//l.add(10);
	m1(l);
	System.out.println(l);
	//l.add(10.5);
}
public static void m1(ArrayList l)
{
	l.add(10);
	l.add(10.5);
	l.add(true);
}
}
