package streamsFilesDirectoriesLesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\04_output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        FileOutputStream outputStream = new FileOutputStream(outPath);

        while (reader.hasNext()){
            if(reader.hasNextInt()){
                System.out.println(reader.nextInt());
            }
            reader.next();
        }
        outputStream.close();
    }
}
