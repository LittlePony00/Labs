package Laba12.N4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parameters = sc.nextLine();
        try {
            Hero hero = Hero.createHero(parameters);
            String s = sc.nextLine();
            while (!s.equalsIgnoreCase("end")){
                if (s.equalsIgnoreCase("action"))
                    System.out.println(hero.action());

                s = sc.nextLine();
            }
            System.out.println(hero);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}