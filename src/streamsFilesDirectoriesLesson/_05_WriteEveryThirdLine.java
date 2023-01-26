package streamsFilesDirectoriesLesson;

import java.io.*;

public class _05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\05_output.txt";


       try (BufferedReader bfReader = new BufferedReader(new FileReader(inputPath));
            PrintStream writer = new PrintStream(new FileOutputStream(outPath)) ){
            int lineCount = 1;

            String line = bfReader.readLine();
            while (line != null){
                if(lineCount % 3 == 0){
                    writer.println(line);
                }
                lineCount++ ;
                line = bfReader.readLine();
            }

       } catch (IOException e){
           e.printStackTrace();
       }
    }
}
