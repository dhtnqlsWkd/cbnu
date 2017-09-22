
public class PS3 {

	public static void main(String[] args) {
		int i, j, k;
		
		for (i = 2; i <= 8; i += 3) {
			for (j = 1; j <= 3; j++) {
				for (k = 0; k < 3; k++) {
					if (i + k > 9);
					else
						System.out.print(i + k + "*" + j + "=" + (i + k) * j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
