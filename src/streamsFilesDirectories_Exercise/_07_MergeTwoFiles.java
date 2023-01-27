package streamsFilesDirectories_Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class _07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path basicPath = Paths.get("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\inputFirst.txt");
        Path outPath = Paths.get("C:\\Users\\User\\Desktop\\04." +
                        " Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt");
        List<String> lines = Files.readAllLines(basicPath);
        Files.write(outPath, lines);
        basicPath = Paths.get("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\inputSecond.txt");
        lines.clear();
        lines = Files.readAllLines(basicPath);
        Files.write(outPath, lines, StandardOpenOption.APPEND);

    }
}

