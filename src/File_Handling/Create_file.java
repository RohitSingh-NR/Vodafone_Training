package File_Handling;

import java.io.File;
//import java.io.IOException;
public class Create_file {
    static File file = new File("C:\\Users\\user\\Desktop\\pahse-I\\src\\File_Handling\\first_file.txt");
    public static void main(String[] args) throws Exception{
        //creating a object (named file) of metadata of file present in hardisk.
        // or we can say file is copy which is in RAM now to perform some operation.
        file.createNewFile();
        System.out.println("file created");
        file.delete();
        System.out.println("file deleted");
    }
}
