import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {11, 16, 21, 26, 35, 39, 47};
		int low = 0, high = 6, middle = 0, i, n, num, flag = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾고자 하는 숫자를 2자리로 입력하세요 : ");
		n = sc.nextInt();
		
		if (n >= 100 || n < 0)
			System.out.println("입력 오류");
		else {
			num = 0;
			while (low <= high) {
				num++;
				middle = (low + high) / 2;
				
				System.out.println("비교값 : " + arr[middle]);
				
				if (arr[middle] == n) {
					flag = 1;
					break;
				}
				else if (arr[middle] < n)
					low = middle + 1;
				else
					high = middle - 1;
			}
			
			if (flag == 1)
				System.out.println(middle + 1 + "번쨰 위치 검색 횟수 = " + num + "번");
			else
				System.out.println("검색 데이터가 없습니다");
		}
	}

}
