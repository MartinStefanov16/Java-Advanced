package L07_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class P01 {
    public static void main(String[] args) throws IOException {

        String path = "/home/marty/Desktop/StringLab/input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {
            System.out.print(Integer.toBinaryString(currentByte) + " ");
            currentByte = inputStream.read();
        }
        inputStream.close();

    }
}
