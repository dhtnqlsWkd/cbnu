
public class Accident {

	public static void main(String[] args) {
		try {
			int score = Integer.parseInt(args[0]);
			
			if (score > 100) {
				throw new NumberFormatException("������ �ʹ� ŭ");
			}
		}
		catch (NumberFormatException e) {
			System.out.println("==============================");
			System.out.println(e.getMessage() + "���� �߻�");
		}
	}

}
