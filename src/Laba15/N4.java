package Laba15;

import java.util.*;

public class N4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        while (!s.equalsIgnoreCase("print")) {

            if (s.equalsIgnoreCase("cancel")) {
                if (queue.size() == 0)
                    System.out.println("Printer is on standby");
                else {
                    System.out.println("Canceled " + queue.peek());
                    queue.poll();

                }
            } else
                queue.add(s);

            s = sc.nextLine();
        }

        for (int i = 0; i <= queue.size(); i++){
            System.out.println(queue.poll());
        }
    }
}
