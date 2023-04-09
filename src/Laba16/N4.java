package Laba16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        String[] s;
        int count = 0;

        while (!(s = sc.nextLine().split("->"))[0].equalsIgnoreCase("search")) {
            map.put(s[0], s[1]);
        }

        while(!(s = sc.nextLine().split("->"))[0].equalsIgnoreCase("stop")){
            for (Map.Entry<String, String> i: map.entrySet()){
                count++;
                if (i.getKey().replaceAll(" ", "").equalsIgnoreCase(s[0])) {
                    System.out.println(i.getKey() + "->" + i.getValue());
                    count = 0;
                    break;
                }
            }
            if (count == map.size())
                System.out.println("Contact " + s[0] + " does note exist");
        }
    }
}
