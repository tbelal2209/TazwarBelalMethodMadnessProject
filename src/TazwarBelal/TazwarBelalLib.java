package TazwarBelal;

public class isPalindromeLib {
    public static boolean isPalindrome(String str) {

        int i = 0;
        for (i = 0; i < str.length(); i--) {
            if (str.substring(str.length()) == str.substring(str.length() - 1, i--)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
