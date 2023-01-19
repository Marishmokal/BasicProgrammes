package basics.programms;

public class Addition {
	public static void main(String[] args) {
		addition(10, 20);
		substraction(20, 10);
		multiplication(5, 5);
		division(20,10);
		reminder(10, 3);
	}

	private static void reminder(int i, int j) {
		// TODO Auto-generated method stub
		  int z; 
		 z = i % j; 
		 System.out.println("reminder is:-" + z);
		 
	}

	private static void multiplication(int i, int j) {
		// TODO Auto-generated method stub
		int z;
		z = i * j;
		System.out.println("multiplication is:-" + z);
	}

	private static void division(int i, int j) {
		// TODO Auto-generated method stub
		int z;
		z = i / j;
		System.out.println("division is:-" + z);
		
	}


	private static void substraction(int a, int b) {
		// TODO Auto-generated method stub
		int z;
		z = a - b;
		System.out.println("Substraction is:-" + z);
	}

	private static void addition(int a, int b) {
		// TODO Auto-generated method stub
		int z;
		z = a + b;
		System.out.println("Addition is:-" + z);
	}

}
