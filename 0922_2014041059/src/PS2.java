
public class PS2 {

	public static void main(String[] args) {
		int sum, i;
		
		sum = 0;
		for (i = 1; ; i++) {
			if (i % 2 == 0)
				sum += -i;
			else
				sum += i;
			
			if (sum > 100)
				break;
		}
		
		System.out.println(i);
	}

}
