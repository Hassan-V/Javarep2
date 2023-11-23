package Shafin_Lab2;
//Shafin ALam - 252 - F - BSE
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"radar", "hello", "level", "world", "deified"};

        System.out.println("Checking for palindromes:");

        for (String str : strings) {
            boolean isPalindromic = isPalindrome(str);
            if (isPalindromic) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
}
