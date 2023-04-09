package Laba16;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String[] s;
        try {
            s = sc.nextLine().split(",");


            while (!s[0].equalsIgnoreCase("end")){
                if (s[0].equalsIgnoreCase("IN"))
                    map.put(s[1], s[0]);
                else if (s[0].equalsIgnoreCase("OUT")) {
                    map.remove(s[1]);
                }
                s = sc.nextLine().split(",");
        }
        }catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }

        if (map.size() == 0) System.out.println("Parking lot is empty");
        else
            for (Map.Entry<String, String> i: map.entrySet()) System.out.println(i.getKey().
                    replaceAll(" ", ""));

    }
}
