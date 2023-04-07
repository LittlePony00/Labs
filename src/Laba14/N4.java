package Laba14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class N4 {
    static String line;
    static String[] list;
    static String s;
    static String new_line = "";
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("C://Users//nikit//IdeaProjects//untitled//src//Laba14//example2.txt");
            Scanner sc = new Scanner(fileReader);
            FileWriter fileWriter = new FileWriter("C://Users//nikit//IdeaProjects//untitled//src//Laba14//example2.txt", true);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (!Character.isDigit(line.charAt(i))) {
                        s = String.valueOf(line.charAt(i));
                        line = line.replace(line.charAt(i), ' ');
                        list = line.split(" ");
                        break;
                    }
                }

                switch (s) {
                    case "+" -> {
                        new_line += list[0] + "+" + list[1] + "=" + (Integer.parseInt(list[0]) + Integer.parseInt(list[1])) + "\n";
                    }
                    case "-" -> {
                        new_line += list[0] + "-" + list[1] + "=" + (Integer.parseInt(list[0]) - Integer.parseInt(list[1])) + "\n";
                    }
                    case "х" -> {
                        new_line += list[0] + "*" + list[1] + "=" + (Integer.parseInt(list[0]) * Integer.parseInt(list[1])) + "\n";
                    }
                    case "/" -> {
                        if (list[1].equals("0"))
                            new_line += list[0] + "/" + list[1] + "=" + "DIVIDE BY ZERO" + "\n";
                        else
                            new_line += list[0] + "/" + list[1] + "=" + (Integer.parseInt(list[0]) + Integer.parseInt(list[1])) + "\n";
                    }
                }
            }

            Files.writeString(Paths.get("C://Users//nikit//IdeaProjects//untitled//src//Laba14//example2.txt"), "");
            fileWriter.write(new_line);
            fileWriter.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
