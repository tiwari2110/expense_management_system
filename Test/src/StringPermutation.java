import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter string :");
		String string = s.nextLine();
		Set<String> permutations = generatePermutations(string);
		
		System.out.println("Here are the unique permutations of " + string);
		
		System.out.println(Arrays.toString(permutations.toArray()));
		
		s.close();


	}

	private static Set<String> generatePermutations(String string) {
		String input = string.toLowerCase();
		Set<String> result = new LinkedHashSet<>();
		permutation("",input,result);
		
		return result;
	}

	private static void permutation(String prefix, String letters, Set<String> result) {
		
		        if (letters.length() == 0) {
		
		            result.add(prefix);
		
		        } else {
		
		            for (int i = 0; i < letters.length(); i++) {
		
		                String letter = letters.substring(i, i + 1);
	
		                String otherLetters = letters.substring(0, i) + letters.substring(i + 1);
		                System.out.println("Prefix: "+prefix +" Letter: "+letter+" Other letter: "+otherLetters);
		
		                permutation(prefix + letter, otherLetters, result);
		
		            }
		
		        }
		
		    }


}
