package streamsFilesDirectories_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class _05_LineNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader bfReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        PrintWriter writer=new PrintWriter("C:\\Users\\User\\Desktop\\04." +
                " Java-Advanced-Files-and-Streams-Exercises-Resources\\05_output.txt");
        String line = bfReader.readLine();
        int counter = 1;

        while (line != null) {
            writer.write(counter + ". " + line+"\n");
            counter++;
            line = bfReader.readLine();
        }
       writer.close();
       bfReader.close();
    }
}


