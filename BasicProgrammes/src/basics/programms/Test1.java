package basics.programms;

public class Test1
{
public static void main(String[] args) 
{
	StringBuilder db=new StringBuilder(5);
	String s="";
	if(db.equals(s))
	{
		System.out.println("match 1");
	}
	else if(db.toString().equals(s.toString()))
	{
		System.out.println("match 2");
	}
	else
	{
		System.out.println("no match");
	}
}
}