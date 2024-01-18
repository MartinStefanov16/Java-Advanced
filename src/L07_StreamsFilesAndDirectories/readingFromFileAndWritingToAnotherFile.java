package L07_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class readingFromFileAndWritingToAnotherFile {
    public static void main(String[] args) throws IOException {
        String path = "/home/marty/Desktop/hello.txt";

        FileInputStream fileStream = new FileInputStream(path);

        int oneByte = fileStream.read();

        while (oneByte >= 0) {
            System.out.print((char) oneByte);
            oneByte = fileStream.read();
        }
        fileStream.close();
    }
}
