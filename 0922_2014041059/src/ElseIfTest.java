import javax.annotation.processing.SupportedSourceVersion;

public class ElseIfTest {

	public static void main(String[] args) {
		int score = 23;
		if (score >= 90 && score <= 100)
			System.out.println("당신은 A학점");
		else if (score >= 80 && score < 90)
			System.out.println("당신은 B학점");
		else if (score >= 70 && score < 80)
			System.out.println("당신은 C학점");
		else if (score >= 60 && score < 70)
			System.out.println("당신은 D학점");
		else if (score >= 0 && score < 60)
			System.out.println("당신은 F학점");
		else
			System.out.println("잘못된 점수");
	}

}
