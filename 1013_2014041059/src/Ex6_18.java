
public class Ex6_18 {

}

//������ �ڵ带 ������ �ϸ� ������ ������ �߻��Ѵ�. ������ ������ �߻��ϴ� ���ΰ� �� ������ �����Ͻÿ�.
//class MemberCall {
//	int iv = 10;
//	static int cv = 20;
//	int iv2 = cv;
//	static int cv2 = iv; // ���� A
//	static void staticMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // ���� B
//	}
//	void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); // ���� C
//	}
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // ���� D
//	}
//	void instanceMethod2() {
//		staticMethod1(); // ���� E
//		instanceMethod1();
//	}
//}
//���� A - static������ �ν��Ͻ������� �ʱ�ȭ �� �� ����
//���� B - static�Լ����� �ν��Ͻ� ������ ����� �� ����
//���� C - static�Լ����� �Ϲ� Ŭ���� �Լ��� ����� �� ����