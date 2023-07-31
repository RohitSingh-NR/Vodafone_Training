package File_Handling;

import java.io.FileOutputStream;

public class WriteToFile_Using_FileOutputStream extends Create_file{
    public static void main(String[] args) throws Exception {
        file.createNewFile();
        FileOutputStream fs = new FileOutputStream(file,true);
        String letsWrite = "\nWritten the 2nd line by append";
        char ch[] = letsWrite.toCharArray();
        for(int i=0; i<ch.length; i++){
            fs.write(ch[i]);
        }
        System.out.println("Work done");
        fs.close();
    }
}
