package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileUsingBufferedReader {
    public static void main(String[] args)throws Exception {
        File file = new File("C:\\Users\\user\\Desktop\\pahse-I\\src\\File_Handling\\first_file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
