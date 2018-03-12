package date;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7};
		int number = getMissingNumber(arr);
		System.out.println(number);
	}

	private static int getMissingNumber(int[] arr) {
		int n= arr.length;
		int total = (n+2)*(n+1)/2;
		for (int i =0; i< n; i++){
			total -= arr[i];
		}
		return total;
	}

}
