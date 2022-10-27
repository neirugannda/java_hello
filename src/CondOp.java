
public class CondOp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2; // num1이 커서 트루면 num1이 나오고 펄스면 num2가 나옴
		System.out.println("큰수" + big);
		
		if(num1 > num2) {
			System.out.println("큰수" + num1);
		}else {
			System.out.println("큰수" + num2);
		}
		
		//절대값
		
		big = (num1 > num2) ? (num1-num2) : (num2 - num1);

	}

}
