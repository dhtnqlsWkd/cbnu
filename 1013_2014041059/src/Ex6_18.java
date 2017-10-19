
public class Ex6_18 {

}

//다음의 코드를 컴파일 하면 컴파일 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
//class MemberCall {
//	int iv = 10;
//	static int cv = 20;
//	int iv2 = cv;
//	static int cv2 = iv; // 라인 A
//	static void staticMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // 라인 B
//	}
//	void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // 라인 C
//	}
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // 라인 D
//	}
//	void instanceMethod2() {
//		staticMethod1(); // 라인 E
//		instanceMethod1();
//	}
//}
//라인 A - static변수를 인스턴스변수로 초기화 할 수 없음
//라인 B - static함수에서 인스턴스 변수를 사용할 수 없음
//라인 C - static함수에서 일반 클래스 함수를 사용할 수 없음