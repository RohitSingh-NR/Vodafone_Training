package File_Handling;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class CodeTest {
    public static void main(String[] args) throws Exception {

        // Adding the files provided by user

        String PathOfFolder = "C:\\Users\\user\\Desktop\\pahse-I\\src\\File_Handling\\TestFolder";
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        System.out.print("How many files you want to add:- ");
        int num = intInput.nextInt();
        //sc.nextLine();
        System.out.println("Enter the name of files you want to add");
        for(int i=1; i<=num; i++){
            System.out.print(i+". ");
        String fileName = strInput.nextLine();
        File file = new File(PathOfFolder+File.separator+fileName);
        file.createNewFile();
        }
        System.out.println("all files are created successfulluy");
        intInput.close();
        strInput.close();

        // Showing the file present in this Directory

        File Folder = new File(PathOfFolder);
        if(Folder.isDirectory()){
            File[] files = Folder.listFiles();
            System.out.println(Arrays.toString(files));
            if(files != null && files.length > 0){
                System.out.println("Folder contains the following files:");
                for(File file1 : files){
                    System.out.println(file1.getName());
                    file1.delete();
                }
            }
            else{
                System.out.println("Folder is empty");
            }
        }
        else{
            System.out.println("Directory doesn't exist or Not a Directory");
        }
        
    }
}
