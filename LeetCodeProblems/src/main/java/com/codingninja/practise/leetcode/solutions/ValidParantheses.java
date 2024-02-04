package com.codingninja.practise.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParantheses {
    public static void main(String[] args) {
        if(isValid("(])")){
            System.out.println("This is Valid String");
        }else{
            System.out.println("This is not a Valid String");
        }
    }
    private static boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[',']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        String abc = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('|| s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.empty()){
                    return false;
                }

                if(map.get(stack.peek()) == s.charAt(i)){
                    stack.pop();
                }else{
                    abc += s.charAt(i)+"";
                }
            }
        }

        return stack.empty() && abc.length()==0;

    }

    public boolean isValidAnother(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}