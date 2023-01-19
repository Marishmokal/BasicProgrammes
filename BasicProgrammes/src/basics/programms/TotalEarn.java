package basics.programms;

class Salary {
  float salary=0.0f;
	String nm;

	public void earn() {
		//Salary s = new Salary();
		salary = 45000;
		nm = "raju";
	}

	 void efforts() {
		//Salary s1 = new Salary();
		//s1.nm = "raju";
	
		System.out.println("salary is:-" + salary);
		System.out.println("name of employee:-" +nm);
	}

}

class Bonus extends Salary {
	static int extra;

	static void festival() {
		extra = 15000;
	}

	static void overAll() {
		System.out.println("extra amount is:-" + extra);
	}

}

public class TotalEarn {
	public static void main(String args[]) {
		Bonus b=new Bonus();
		b.earn();
		b.efforts();
		Bonus.festival();
		Bonus.overAll();
	}
}
