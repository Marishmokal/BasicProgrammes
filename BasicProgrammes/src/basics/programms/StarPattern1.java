package basics.programms;

public class StarPattern1 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
