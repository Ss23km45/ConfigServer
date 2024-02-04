package com.codingninja.practise.leetcode.solutions;

class LongestPalindromicString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if(isPalindrome(sub)){
                    if(result.length() < sub.length()){
                        result = sub;
                    }
                }
            }
        }

        return result;
    }

    private static boolean isPalindrome(String substring) {
        int f = 0;
        int l =substring.length() -1 ;

        while (f < l){
            if(substring.charAt(f) != substring.charAt(l)){
                return false;
            }
            f++;
            l--;
        }

        return true;
    }
}