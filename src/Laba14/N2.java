package Laba14;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class N2 {
    static String line;
    static int count;
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(new File("C://Users//nikit//IdeaProjects//untitled//src//Laba14//example1.txt"));
            Scanner sc = new Scanner(fileReader);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(line.charAt(i)))
                    {
                        count += Integer.parseInt(String.valueOf(line.charAt(i)));
                    }
                }
            }

            System.out.println(count);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

