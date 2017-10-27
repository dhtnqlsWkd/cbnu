
public class Accident {

	public static void main(String[] args) {
		try {
			int score = Integer.parseInt(args[0]);
			
			if (score > 100) {
				throw new NumberFormatException("점수가 너무 큼");
			}
		}
		catch (NumberFormatException e) {
			System.out.println("==============================");
			System.out.println(e.getMessage() + "예외 발생");
		}
	}

}
