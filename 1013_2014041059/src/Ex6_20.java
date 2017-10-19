
public class Ex6_20 {

	public static int[] shuffle(int[] arr) {
		int i, a, tmp;
		
		if(arr == null)
			return arr;
		
		for(i = 0; i< arr.length; i++) {
			a = (int)(Math.random() * arr.length);
			
			tmp = arr[i];
			arr[i] = arr[a];
			arr[a] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
}

//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//[5, 4, 8, 6, 1, 3, 2, 7, 9]