package Laba11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");

        switch (s[0].toLowerCase()) {
            case "boat" -> {
                try {
                    Boat boat = new Boat(Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                    System.out.print(boat.writeInformation());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
            }
            case "airplane" -> {
                try {
                    Airplane airplane = new Airplane(Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]),
                            Boolean.getBoolean(s[4]));
                    System.out.println(airplane.writeInformation());
                }catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
            }
            case "car" -> {
                try {
                    Car car = new Car(Integer.parseInt(s[1]), Integer.parseInt(s[2]), s[3]);
                    System.out.println(car.writeInformation());

                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
