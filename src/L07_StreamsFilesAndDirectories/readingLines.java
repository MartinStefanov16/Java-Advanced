package L07_StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class readingLines {
    public static void main(String[] args) throws IOException {
        String path = "/home/marty/Desktop/hello.txt";
        String path2 = "/home/marty/Desktop/printHere.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        FileOutputStream outputStream = new FileOutputStream(path2);
        PrintWriter writer = new PrintWriter(outputStream);
        writer.println(firstLine);
        writer.println(secondLine);

        writer.close();




    }
}
