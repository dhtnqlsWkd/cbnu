import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		boolean flag;
		char grade;
		
		System.out.print("임의의 숫자를 입력하세요 : ");
		score = sc.nextInt();
		System.out.println("점수 : " + score);
		
		grade = 0;
		flag = false;
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = 'F';
			break;
		default:
			flag = true;
		}
		
		if (flag)
			System.out.println("잘못된 입력");
		else
			System.out.println("입력된 점수 " + score + "점은 " + grade + "학점입니다");
	}

}
