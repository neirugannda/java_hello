
public class Grade {

	public static void main (String[] args) {

		/* System.out.println(grade(avg(100,95,95))); *///평균을 먼저 연산하고 그담 그레이드 하는법
		/* System.out.println(getHap(10)); */ //1부터 10까지의 합 55가 나와야댐
		System.out.println(getHapPrint(10)); //1+2+3+4+5+6+7+8+9+10로 출력이되게
	}
	public static int getHap(int num) {
		int sum = 0;


		for(int i = 1; i <= num; i++){
			sum += i; // sum = sum + i;


		}
		return sum;

	}
	/*public static double avg(int kor, int eng, int math) {
		return (kor+eng+math)/3.0;
	}//평균내는 함수
	public static char grade(double avg) {
		char ch = ' ';

		if(avg>=90)
			ch = '수';
		else if(avg >= 80)
			ch = '우';
		else if(avg >= 70)
			ch = '미';
		else if(avg >= 60)
			ch = '양';
		else 
			ch = '가';
		return ch;*/
}


