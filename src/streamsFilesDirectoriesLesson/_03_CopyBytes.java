package streamsFilesDirectoriesLesson;

import javax.imageio.stream.FileImageOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_CopyBytes {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\03_output.txt";

        FileOutputStream outputStream = new FileOutputStream(outPath);

        try(FileInputStream fileStream = new FileInputStream(inputPath)) {
            int oneByte = fileStream.read();
            while(oneByte >= 0){
                if(oneByte == 10 || oneByte == 32){
                    outputStream.write(oneByte);
                } else {
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        outputStream.write(digit.charAt(i));
                    }
                }
                oneByte = fileStream.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        outputStream.close();




    }
}
