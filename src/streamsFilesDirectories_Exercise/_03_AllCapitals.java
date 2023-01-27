package streamsFilesDirectories_Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class _03_AllCapitals {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new BufferedReader(new FileReader
                ("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt")));
        PrintWriter writer = new PrintWriter("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        while (scanner.hasNext()){
            String input=scanner.nextLine().toUpperCase();
            writer.println(input);
        }
        writer.close();
        scanner.close();


    }
}

