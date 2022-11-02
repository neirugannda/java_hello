
public class Method {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램의 끝");

	}
	public static void hiEveryone(int age) { // 함수만드는것은 클레스 안에다 만든다 1. void자리에 오는걸 리턴타입 그 옆 함수명(개발자가정함) 그담 괄호 
		//						 　변수선언 - 파라미터(인자)			
		// 함수 써먹는건 다른 만들어진 함수에서 써먹는데 함수이름을 가져와서 (안에 값을 넣음)
		System.out.println("좋은 아침입니다");
		System.out.println("제 나이는"+age+"입니다");
	}
}
