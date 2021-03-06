import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Coding.Troll(Richard Monseglio)
 *
 */
public class ThreeFunctions {

	public static void main(String[] args) {
		
		System.out.println(reverseString());
		System.out.println(isPalindrome());
		System.out.println(randBetween());
		

	}
	public static StringBuilder reverseString() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s1 = userInput.next();
		StringBuilder input1 = new StringBuilder();
		input1.append(s1);
		input1.reverse();
		return input1;	
	}
	public static boolean isPalindrome() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a new word to check to see if it is a palindrome: ");
		String s = input.next();
		int low = 0;
		int high = s.length() - 1;
		
		boolean isPalindrome = true;
		while(low < high) {
			if(s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		if(isPalindrome) {
			return true;
		}else {
			return false;
		}
	}
	public static int randBetween() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num1 = read.nextInt();
		System.out.println("Enter another Integer bigger than last Integer: ");
		int num2 = read.nextInt();
		Random num = new Random();
		int min = num1;
		int max = num2;
		
		int randNum = num.nextInt(max-min) + min;
		
		return randNum;
		
	}

}
