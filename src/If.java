
public class If {

	public static void main(String[] args) {
		/*int n1 = 5;
		int n2 = 7;

		//if문
		if(n1 < n2) {
			System.out.println("n1 < n2 is true");
		}
		//if~else문
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");


		}else {
			System.out.println("n1 == n2 is false");
		}
		 */

		int kor  = 90; 
		int eng  = 80;
		int math = 70;
		int avg = kor + eng + math / 3.0;


		if(avg >= 90) {
			System.out.println("수");
		}else if(avg >= 80) {
			System.out.println("우");
		}	
		}else if(avg >= 70) {
			System.out.println("미");
		}	
		}else if(avg >= 60) {
			System.out.println("양");
		}	
		}else (avg < 60) {
			System.out.println("가");
		}	



}

}
