package streamsFilesDirectoriesLesson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class _06_SortLines {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\06_output.txt";

        Path path = Paths.get(inputPath);
        List<String> sortedLines = Files.readAllLines(path).stream().sorted().collect(Collectors.toList());

        Path out = Paths.get(outPath);
        Files.write(out, sortedLines);
    }
}
