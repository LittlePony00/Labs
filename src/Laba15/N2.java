package Laba15;

import java.util.*;
//ЕЩЁ НЕ СДЕЛАНА
public class N2 {

    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static String getSubOfStack(Stack<String> stack) {
        String s = "";
        while (!stack.peek().equals("(")) {
            s += stack.pop();
        }
        stack.pop();
       return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String[] s  = sc.nextLine().split("");
        List<String> arr = new ArrayList<>();
        String full_line = "";

    }
}
