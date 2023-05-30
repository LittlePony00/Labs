package Laba15;

import java.util.*;

public class N2 {
    public static String line = " ";

    public static boolean find_brackets(String s) {
        if (String.valueOf(s.charAt(0)).equalsIgnoreCase("("))
            return find_brackets(s.substring(1));
        else return String.valueOf(s.charAt(0)).equalsIgnoreCase(")");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(find_brackets(s));
    }

}
