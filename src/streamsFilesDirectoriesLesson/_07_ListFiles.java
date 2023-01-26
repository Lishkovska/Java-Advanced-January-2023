package streamsFilesDirectoriesLesson;

import java.io.File;
import java.io.IOException;

public class _07_ListFiles {
    public static void main(String[] args) throws IOException {

        String folderPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(folderPath);

        File[] fileArr = file.listFiles();
        for (File files : fileArr) {
            if(files.isFile()){
                System.out.printf("%s: [%d]%n",files.getName(), files.length());
            }
        }
    }
}
