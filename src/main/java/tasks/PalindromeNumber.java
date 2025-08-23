package tasks;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String str = new StringBuilder(String.valueOf(x)).reverse().toString();
        return String.valueOf(x).equals(str);
    }
}
