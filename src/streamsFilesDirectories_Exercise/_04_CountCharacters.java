package streamsFilesDirectories_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _04_CountCharacters {
    public static void main(String[] args) throws IOException {

        BufferedReader bfReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        PrintWriter writer=new PrintWriter("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\04_output.txt");
        Map<String, Integer> counterMap = new LinkedHashMap<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuation = Set.of('!', '.', '?',',');
        String line= bfReader.readLine();
        counterMap.put("Vowels", 0);
        counterMap.put("Other symbols", 0);
        counterMap.put("Punctuation", 0);

        while (line != null) {

            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);

                if (vowels.contains(symbol)) {
                    counterMap.put("Vowels", counterMap.get("Vowels") + 1);
                } else if (punctuation.contains(symbol)) {
                    counterMap.put("Punctuation", counterMap.get("Punctuation") + 1);
                } else if (symbol != ' ') {
                    counterMap.put("Other symbols", counterMap.get("Other symbols") + 1);
                }
            }
            line= bfReader.readLine();
        }
        counterMap.entrySet().forEach(e->writer.println(e.getKey()+": "+e.getValue()));
        writer.close();
       bfReader.close();
    }
}

