package streamsFilesDirectoriesLesson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_WriteToFile {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\output.txt";
        List<Character> punctuationList = Arrays.asList(',' , '.' , '?' , '!');

        OutputStream outputStream = new FileOutputStream(outPath);

        try(FileInputStream fileStream = new FileInputStream(inputPath)) {
            int oneByte = fileStream.read();
            while(oneByte >= 0){
                if (!punctuationList.contains((char)oneByte)){
                    outputStream.write(oneByte);
                }
                oneByte = fileStream.read();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        outputStream.close();

    }
}
