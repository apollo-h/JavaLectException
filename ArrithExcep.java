import java.util.Scanner;

public class ArrithExcep {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int x = 1;
		do {

			try {

				System.out.println("Enter the first Number");
				int n1 = input.nextInt();
				System.out.println("Enter the first Number");
				int n2 = input.nextInt();
				int result = n1 / n2;
				System.out.println("Result = " + result);
				x = 2;
			} catch (Exception e) {
				System.out.println("Never Devide a Number by  ZERO. You shall not pass");
			}
		} while (x == 1);
	}
}
