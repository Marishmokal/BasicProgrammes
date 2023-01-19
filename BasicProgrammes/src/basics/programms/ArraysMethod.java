package basics.programms;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod {
	public static void main(String[] args) {
		int[] x = { 54, 12, 72, 89, 5, 22 };
		System.out.println("int array before sorting");
		for (int y : x) {
			System.out.println(y);
		}
		Arrays.sort(x);
		System.out.println("int arrays after sorting");
		for (int y : x) {
			System.out.println(y);
		}
		
		String[]s= {"A","Z","B"};
		System.out.println("Object array before soring");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("Object array after sorting");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		Arrays.sort(s,new MyComparator());
		System.out.println("Object array after sorting by comparator");
		for(String s2:s)
		{
			System.out.println(s2);
		}
	}
}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
