package threedplm_programs;

import java.util.Scanner;

public class FirstOccuranceChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any word");
		String str = scan.nextLine();
		String finalStr = str;
		char occuranceOfFirstNonRepeatedChar = getfirstOccuranceOfNonRepeatedChar(str, finalStr);
		System.out.println("The first non repeated character in your word is : "+occuranceOfFirstNonRepeatedChar);

	}

	private static char getfirstOccuranceOfNonRepeatedChar(String str, String finalStr) {
		char arrChar[] = str.toCharArray();
		int count = 0;
		int indexOfOccuranceOfFirstNonRepeatedChar = 0;
		for (int i = 0; i < arrChar.length; i++) {
			count = 0;
			for (int j = i+1; j < arrChar.length; j++) {
				if (arrChar[i] == arrChar[j] && arrChar[i]!=' ') {
					arrChar[j]=' ';
					count++;
					System.out.println("count++"+count+arrChar[i]);
					break;
				}
			}
			if(arrChar[i]!=' ' && count == 0)
			{
				indexOfOccuranceOfFirstNonRepeatedChar = i;
				System.out.println("indexOfOccuranceOfFirstNonRepeatedChar="+indexOfOccuranceOfFirstNonRepeatedChar);
				break;
			}
		}
		System.out.println("str"+str);
		System.out.println("finalStr"+finalStr);
		return finalStr.charAt(indexOfOccuranceOfFirstNonRepeatedChar);
	}

}
