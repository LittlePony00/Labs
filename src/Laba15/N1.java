package Laba15;

import java.util.*;

public class N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Stack<Integer> stack = new Stack<>();

        while (n != 0) {
            stack.add(n%2);
            n /= 2;
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop() + "");
        }

    }
}
