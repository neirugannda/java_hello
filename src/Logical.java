
public class Logical {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		int num3 = 77;
		
		boolean result;
		
		//변수 num1에 저장된 값이 1과 100사이의 수인가
		result = (1 < num1)&&(num1 < 100);
		System.out.println("1초과 100 미만인가?"+result);
		
		//변수 num2에 저장된 값이 2또는3의 배수인가?
		result = ((num2 % 2) == 0)||((num2%3) == 0);
		System.out.println("2또는 3의 배수인가?"+result);

		//변수 num1이 0인가?
		result = !(num1 != 0);
		System.out.println("0인가?"+result);
		
		//77이 7의 배수이고 11의 배수인지 판별
		result = ((num3%7)==0)&&((num3%11)==0); // 0은 나누어서 나온 값이 0인가의 0임
		System.out.println("77은 7의 배수이고 11의 배수인가?"+result);
		
		//77이 짝수이고 7의 배수 11의배수
		result = ((num3%7)==0)&&((num3%11)==0)&&((num3%2)==0); // 0은 나누어서 나온 값이 0인가의 0임
		System.out.println("77은 7의 배수이고 11의 배수인가?"+result);
		
	}

}
