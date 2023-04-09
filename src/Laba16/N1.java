package Laba16;

import java.util.*;

public class N1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for (String i: s)
            list.add(Integer.parseInt(i));

        while (!s[0].equalsIgnoreCase("end")) {
            s = sc.nextLine().split(" ");

            switch (s[0].toLowerCase()){
                case "add" -> {
                    list.add(Integer.valueOf(s[s.length-1]));
                }
                case "remove" -> {
                    if (Integer.parseInt(s[1]) > list.size())
                        System.out.println("Invalid index");
                    else
                        list.remove(Integer.parseInt(s[1]));
                }
                case "insert" -> {
                    if (Integer.parseInt(s[1]) > list.size())
                        System.out.println("Invalid index, max index = " + (list.size()-1));
                    else
                        list.add(Integer.parseInt(s[s.length-1]), Integer.parseInt(s[s.length-2]));
                }
                case "shift" ->{
                    if (s[1].equalsIgnoreCase("left")) {
                        Collections.rotate(list, -Integer.parseInt(s[2]));
                    } else if (s[1].equalsIgnoreCase("right")) {
                        Collections.rotate(list, Integer.parseInt(s[2]));
                    }
                }
            }
        }

        for (Integer i: list) System.out.print(i + " ");
    }
}
