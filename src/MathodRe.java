
public class MathodRe {

	public static void main(String[] args) {
		int result;
		result = adder(4,5); //에더가 4,5를 호출
		System.out.println("4+5="+result);
		System.out.println("3.5*3.5="+square(3.5));
	}
	public static int adder(int num1, int num2) {
				//여기다 적음		//4        5
		int addResult = num1 + num2;
		return addResult; //여기서 데이터 타입을 못적어서
	}
	public static double square(double num) {
		return num * num;
	}
}
