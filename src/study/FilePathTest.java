package study;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathTest {
    public static void main(String [] args){
        String filePath = "/Users/jangwoosuk/Desktop/";
        DirectoryStream<Path> stream = null;
        try {
            stream = Files.newDirectoryStream(Paths.get(filePath));

        for(Path path : stream) {
            String fileName = java.net.URLDecoder.decode(path.toUri()
                    .toString()
                    .substring(path.toUri().toString().lastIndexOf("/") + 1)
                    .replace("+", "%2B"), "UTF-8");
            System.out.println("file name is : "+fileName);
        }
            stream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(filePath+"스터디");
        System.out.println("file is exists? : "+file.exists());
        File [] fileArr = file.listFiles();
        for(File ff : fileArr){
            System.out.println(ff.getName());
        }
        File file2 = new File(file.getAbsolutePath()+"/테스트한글.txt");
        System.out.println("Korean file name is exists? " + file2.exists() + " name is : " +file2.getName());
    }
}
