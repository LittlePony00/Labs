package Laba15;

import java.util.*;

public class N3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, sc.nextLine().split(""));
        List<String> last = new ArrayList<>();

        while (stack.size() > 0) {
            String s = stack.pollLast();
            switch (s) {
                case ")" -> {
                    last.add("(");
                }
                case "]" -> {
                    last.add("[");
                }
                case "}" -> {
                    last.add("{");
                }
                case "(", "[", "{" -> {
                    try {
                        if (!last.get(last.size() - 1).equals(s)) {
                            System.out.println("NO");
                            return;
                        }
                        last.remove(last.size() - 1);
                    }catch (IndexOutOfBoundsException e){
                        throw new IndexOutOfBoundsException("The number of brackets isn't even");
                    }
                }
            }
        }

        if (last.size() == 0) System.out.println("YES");
        else throw new IndexOutOfBoundsException("The number of brackets isn't even");
        }
    }


