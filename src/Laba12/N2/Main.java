package Laba12.N2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        Student student = new Student(scn.next(), scn.next(), scn.next());
        Worker worker = new Worker(scn.next(), scn.next(),
                Double.parseDouble(scn.next()), Double.parseDouble(scn.next()));


        System.out.println(student);
        System.out.println(worker);

    }
}
