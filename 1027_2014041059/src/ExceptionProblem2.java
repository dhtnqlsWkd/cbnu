
public class ExceptionProblem2 {

	public static void main(String[] args) {
		int ar[] = {10, 20, 30};
		
		try {
			for (int i = 0; i <= ar.length; i++) {
				System.out.println("ar[" + i + "] : " + ar[i]);
			}
		}
		catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
	}

}
