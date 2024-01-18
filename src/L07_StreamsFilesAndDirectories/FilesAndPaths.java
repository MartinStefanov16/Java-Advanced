package L07_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesAndPaths {
    public static void main(String[] args) throws IOException {

        Path inPath = Paths.get("/home/marty/Desktop/hello.txt");
        Path outPath = Paths.get("/home/marty/Desktop/printHere.txt");

        List<String> lines = Files.readAllLines(inPath);
        Files.write(outPath, lines);
    }
}
