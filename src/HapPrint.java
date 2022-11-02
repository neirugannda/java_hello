
public class HapPrint {

	public static void main(String[] args) {

		printSum(10);

	}

	public static void printSum(int num) {

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;

			System.out.print(i);

			if (i < num) {
				System.out.print(" + ");
			} else {
				System.out.print(" = "+sum );
			}
		}

	}
}