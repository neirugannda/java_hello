
public class starPrint {

	public static void main(String[] args) {

		starPrint(3);
		System.out.println();
		starPrint(5);
	}
	static void starPrint(int num) {	
		for(int i=1; i<=num; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
