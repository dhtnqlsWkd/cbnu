
public class Ex6_8 {
	
	int kind;
	int num;
	static int width;
	static int height;
	
	Ex6_8(int k, int n) {
		kind = k;
		num = n;
	}
	
	public static void main(String args[]) {
		Ex6_8 card = new Ex6_8(1, 1);
	}
	
}

//클래스변수(static변수) : wihth, height
//인스턴스변수 : kind, num
//지역변수 : k, n, card