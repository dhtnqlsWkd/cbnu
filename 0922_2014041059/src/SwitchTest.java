import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		boolean flag;
		char grade;
		
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		score = sc.nextInt();
		System.out.println("���� : " + score);
		
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
			System.out.println("�߸��� �Է�");
		else
			System.out.println("�Էµ� ���� " + score + "���� " + grade + "�����Դϴ�");
	}

}
