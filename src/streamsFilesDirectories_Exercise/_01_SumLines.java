package streamsFilesDirectories_Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _01_SumLines {
    public static void main(String[] args) throws IOException {

        String basicPath = "C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(basicPath));

        allLines.forEach(line -> {
            int sum = 0;
            for (char symbol : line.toCharArray()){
                sum += (int)symbol;
            }
            System.out.println(sum);
                });

    }
}
