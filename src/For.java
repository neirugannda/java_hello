
public class For {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("i love you" + i);
		}

		//1부터 100까지의 합

		int i = 1;
		int sum = 0;

		for(i = 1; i <= 100; i++){
			sum += i; // sum = sum + i;
		}

		System.out.println(sum);
	}
}
