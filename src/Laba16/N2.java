package Laba16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N2 {

    public static void addNewPassengers(List<Integer> list, int x, int max){
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) + x) <= max){
                int j = list.get(i) + x;
                list.remove(i);
                list.add(i, j);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();


        try {
            for (String i : s) list.add(Integer.parseInt(i));
            int max = Integer.parseInt(sc.nextLine());

            while (!(s = sc.nextLine().split(" "))[0].equalsIgnoreCase("end")) {
                if (s[0].equalsIgnoreCase("add")) {
                    if (Integer.parseInt(s[1]) <= max) list.add(Integer.parseInt(s[1]));
                    else System.out.println("You cannot add this number, cause it's bigger than max");

                } else {
                    addNewPassengers(list, Integer.parseInt(s[0]), max);
                }
            }
            System.out.println(list);
        }catch (IllegalArgumentException e){
            System.out.println("You can't use this with list of integer numbers");
        }
    }

}

