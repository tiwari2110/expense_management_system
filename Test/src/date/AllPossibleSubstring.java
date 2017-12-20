package date;

public class AllPossibleSubstring {
	
	
	

	public static void main(String[] args) {
		
		String str ="abc";
		AllSubstring(str, str.length());
	}

	private static void AllSubstring(String str, int length) {
		
		for (int i =0; i<length ; i++) {
			for(int j=i+1; j<=length; j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
