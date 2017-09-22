
public class PS {

	public static void main(String[] args) {
		int a, sum = 0;
		
		for (a = 1; a <= 20; a++)
			if (a % 2 == 1 & a % 3 != 0)
				sum += a;
		
		System.out.println(sum);
	}

}
