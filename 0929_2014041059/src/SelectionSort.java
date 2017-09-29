
public class SelectionSort {

	public static void main(String[] args) {
		int test[] = {20, 30, 40, 50, 10};
		int i, j, temp;
		System.out.println("정렬 전");
		for (i = 0; i < test.length; i++)
			System.out.println(i + "번째 데이터 " + test[i]);
		
		for (i = 0; i < test.length - 1; i++) {
			temp = i;
			for (j = i; j < test.length; j++) {
				if (test[temp] < test[j])
					temp = j;
			}
			
			j = test[i];
			test[i] = test[temp];
			test[temp] = j;
		}
		
		System.out.println();
		System.out.println("정렬 후");
		for (i = 0; i < test.length; i++)
			System.out.println(i + "번째 데이터 " + test[i]);
	}

}
