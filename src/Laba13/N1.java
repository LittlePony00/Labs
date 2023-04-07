package Laba13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class N1 {
    static String line;
    static int count = 0;
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(new File("C://Users//nikit//IdeaProjects//untitled//src//Laba13//example1.txt"));
            Scanner sc = new Scanner(fileReader);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (String.valueOf(line.charAt(i)).equals(".") ||
                    String.valueOf(line.charAt(i)).equals(")") ||
                    String.valueOf(line.charAt(i)).equals("(") ||
                    String.valueOf(line.charAt(i)).equals("–"))
                    {
                        count++;
                    }
                }
            }

            System.out.println(count);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
