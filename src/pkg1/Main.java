package pkg1;
//다형성: 상속 + 메소드 재정의 + 동적 바인딩 + 자동 형 변환
//1. Scanner 클래스 사용하기 위한 import 명령어 작성
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		//3. 자동 형 변환 개념을 사용하기 위해 나중에 생성될 구체적인 도형 객체의 주소를 보관할 참조변수 선언
		Shape b = null;
		/*
		 * null의 의미: 아직 구체적인 도형 객체를 생성하지 않았기 때문
		 *  - 즉, 사용자가 메뉴 번호를 입력하는 시점에 생성		
		 */
		//4. 사용자가 메뉴 번호를 고를 수 있도록 메뉴들을 표시
		System.out.println("*** 도형 그리기 프로그램 ***");
		System.out.println("1. 선 그리기 2. 사각형 그리기 3. 원 그리기");
		System.out.print("도형을 선택하시고 메뉴 번호를 입력하세요:");
		
		//5. 사용자로부터 정수 값을 입력 받기(1~4, 그 외 값)
		int d = a.nextInt();
		
		//6. 만약 사용자가 1을 입력한 경우
		/*
		 * 1) 화면에 선을 그리기 위해 2가지 일을 수행해야 함.
		 * 가. 객체 생성: Line 변수명 = new Line();
		 * 나. draw() 메소드 호출: 변수명.draw();
		 * 
		 * 또는 위에서 선언한 Shape b 참조 변수를 사용하기
		 *  - b = new Line();
		 *  - b.draw();
		 */
		if(d == 1) {
			b = new Line();
			b.draw();
		}
		//만약 사용자가 사각형을 선택한 경우
		else if(d == 2) {
			b = new Rect();
			b.draw();
		}
		else if(d == 3) {
			b = new Circle();
			b.draw();
		}
		else {
			System.out.println("바른 값을 입력해주세요.");
		}
		
		
		
		a.close();
	}

}