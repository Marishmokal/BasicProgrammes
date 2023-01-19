package basics.programms;//getclass programme

public class GetClass{
public static void main(String[] args) {
	Object obj=new Integer (10);
	Class marish=obj.getClass();
	System.out.println("class of Object Obj is:-"+marish.getName());
	
}
}
