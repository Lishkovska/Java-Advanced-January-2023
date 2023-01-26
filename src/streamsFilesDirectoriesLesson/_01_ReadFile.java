package streamsFilesDirectoriesLesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        
        try(FileInputStream filestream = new FileInputStream(path)){
           int oneByte = filestream.read();
           while(oneByte >= 0){
               System.out.printf("%s ",Integer.toBinaryString(oneByte));
               oneByte = filestream.read();
           }
        } catch (IOException e){
           e.printStackTrace();
        }

    }
}
