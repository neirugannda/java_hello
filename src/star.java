
public class star {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");     //print로 해야됨 ln이 아니라 ln은 개행 print는 5개째에 커서가 깜빡거리는상태라고 이해
			}
			System.out.println();
		}
	}
}

