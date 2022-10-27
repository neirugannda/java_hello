
public class switch1 {

	public static void main(String[] args) {
		int n = 65;
		
		switch(n)//정수에 해당되는 문자랑 문자열이 올 수 있음'A' 
		{
		case 'A': // 'A'는 = 65 컴파일될때 문자가 올 수가 있으나 char가 아니기때문에 정수로 변환
 			System.out.println("simple java");
		case 2:
			System.out.println("funny java");
			break;
		case 3:
			System.out.println("fantastic java");
		default:
			System.out.println("best java");
		}
		
		System.out.println("do you like java?");
	}

}
