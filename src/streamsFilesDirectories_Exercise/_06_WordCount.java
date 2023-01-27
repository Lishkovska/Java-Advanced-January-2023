package streamsFilesDirectories_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_WordCount {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        Scanner scanner = new Scanner(bufferedReader);
        PrintWriter writer=new PrintWriter("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\06_output.txt");
        Map<String, Integer> counterByWords = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String word[] = line.split("\\s+");
            for (int i = 0; i < word.length; i++) {
                counterByWords.putIfAbsent(word[i], 0);
            }
        }
        bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        scanner = new Scanner(bufferedReader);


        while (scanner.hasNextLine()) {
            String compareLine = scanner.nextLine();
            String word[] = compareLine.split("\\s+");
            for (int i = 0; i < word.length; i++) {
                if (counterByWords.containsKey(word[i])) {
                    counterByWords.put(word[i], counterByWords.get(word[i]) + 1);

                }
            }
        }
        counterByWords.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> writer.println(e.getKey()+" - "+e.getValue()));

        writer.close();

       bufferedReader.close();
    }
}

