
public class ExTwo {

	public static void main(String[] args) {
		int[] arr = {500, 100, 50, 10};
		int num;
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for (int i = 0; i < arr.length; i++) {
			num = money / arr[i];
			System.out.println(arr[i] + "¿ø : " + num);
			money %= arr[i];
		}
	}

}
