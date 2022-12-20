
package pkg1;

public class Line extends Shape {
	/*
	 * draw() 메소드를 재정의하는 방법은 2가지가 있다.
	 * 1. 안전한 방법: 입력 오류를 없애는 방법
	 *  - 예) drow()
	 *   - 엄격함(강제성): jdk 1.5버전부터 어노테이션 문법이 추가
	 *    - 이름을 잘못 쓰면 오류가 남(컴파일 시점, 실행 전)
	 *     - 형식: 메소드 정의 위에다 장식을 답니다. -> @Override
	 */
	
	@Override
	public void draw() {
		System.out.println("선을 화면에 그립니다.");
	}
}






