
public class avg {

	public static void main(String[] args) {
		int kor  = 90; 
		int eng  = 80;
		int math = 70;
		int total;
		double avg;
		total = kor + eng + math;
		avg = total / 3.0;


		if(avg >= 90) {
			System.out.println("수");
		}else if(avg >= 80) {
			System.out.println("우");
		}else if(avg >= 70) {
			System.out.println("미");
		}else if(avg >= 60) {
			System.out.println("양");
		}else{
			System.out.println("가"); //else if는 조건문이 오나ㅏ else다음에는 ()가 안옴
		}	

	}

}
