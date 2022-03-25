package Aula04;

import java.util.Scanner;

public class Ex2 {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("String: ");
		String str = sc.nextLine();

		System.out.println("n caracteres (0..9): " + countDigits(str));
		System.out.println("n spaces: " + countSpaces(str));
		System.out.println("só minusculas?: " + (onlyLowerCase(str) ? "sim" : "nao"));
		System.out.println("sem double spaces: " + rmDoubleSpaces(str));
		System.out.println("palindromo?: " + (isPalindrome(str) ? "sim" : "nao"));
	}

	public static int countDigits(String str) {
		return str.replaceAll("[^0-9]", "").length();
	}

	public static int countSpaces(String str) {
		return str.replaceAll("[^\\s]", "").length();
	}

	public static boolean onlyLowerCase(String str) {
		return str.equals(str.toLowerCase());
	}

	public static String rmDoubleSpaces(String str) {
		return str.replaceAll("[\\s]+", " ");
	}

	public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
	}
}
