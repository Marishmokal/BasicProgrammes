package basics.programms;

	class DisplayOverloading3
	{
//	   public void disp(Integer... b)
//	   {
//	       System.out.println("I知 the first definition of method disp");
//	   }
	   
	   public void disp(int... a)
	   {
	       System.out.println("I知 the second definition of method disp" );
	   }
//		public void disp(Number n)
//		{
//	       System.out.println("I知 the third definition of method disp" );
//	   }
//		public void disp(Object n)
//		{
//	       System.out.println("I知 the fourth definition of method disp" );
//	   }
	}
	public class Sample
	{
	   public static void main(String args[])
	   {
	       DisplayOverloading3 obj = new DisplayOverloading3();
	  // Integer a=50;
	      obj.disp(null);
	    //  obj.disp(52l,53l);
	   }
	}
