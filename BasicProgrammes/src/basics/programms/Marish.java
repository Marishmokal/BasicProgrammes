package basics.programms;//conversion of String and String buffer

class Marish
{
public static void main(String[] args) {
	//String  s="Vaibhav";
	StringBuffer s1=new StringBuffer("vaibhav");
	String s2=s1.toString();
	System.out.println(s2);
	
	
	String s="marish";
	StringBuffer s3=new StringBuffer(s);
	System.out.println(s3);
	
	
}



		
}

