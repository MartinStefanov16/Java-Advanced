package L07_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02 {
    public static void main(String[] args) throws IOException {
        String pathRead = "/home/marty/Desktop/StringLab/input.txt";
        String pathOutput = "/home/marty/Desktop/StringLab/outputP2.txt";
        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathOutput);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {
            char currentSymbol = (char) currentByte;
            if (currentSymbol != '.' && currentSymbol != ',' && currentSymbol != '!'&& currentSymbol != '?') {
                outputStream.write(currentSymbol);
            }

            currentByte = inputStream.read();
        }
        inputStream.close();
        outputStream.close();



    }
}
