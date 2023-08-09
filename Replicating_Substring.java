public class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String substring = s.substring(0, len);
                StringBuilder repeated = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    repeated.append(substring);
                }
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "abcabcabc";
        String s3 = "abcdabcdabcd";
        System.out.println(repeatedSubstringPattern(s1));
        System.out.println(repeatedSubstringPattern(s2)); 
        System.out.println(repeatedSubstringPattern(s3)); 
    }
}
