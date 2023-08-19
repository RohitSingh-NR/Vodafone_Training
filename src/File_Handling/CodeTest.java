package File_Handling;
//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
//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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

public class CodeTest {
    public static void main(String[] args) throws IOException {

        // Adding the files provided by user

        String PathOfFolder = "C:\\Users\\user\\Desktop\\pahse-I\\src\\File_Handling\\TestFolder";
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        int num;
        //Do-while loop to get the valid input from the user
        //if the user enters something other than an integer 
        //(e.g., "abc" or "1.23"), the nextInt() method will throw
        // an InputMismatchException, and the invalid input ("abc" or "1.23") will remain in the buffer.
        // If the program doesn't clear this invalid input from the buffer, it will cause an infinite loop
        // because the same invalid input will be read repeatedly.
        do{
            try{
        System.out.print("How many files you want to add:- ");
        num = intInput.nextInt();
        break;
            }
        catch(InputMismatchException e){
            System.out.println("please Enter a valid number");
            System.out.println();
            intInput.next();// To clear the Scanner Buffer so that it will take a new value
        }
    }
        while(true);
        //We can use [sc.nextLine();] if not taking different variable for intesger and string to avoid enter as a value from user
            File Folder = new File(PathOfFolder);
            List<String> al = new ArrayList<>();
            System.out.println("Enter the name of files you want to add");
            for(int i=1; i<=num; i++){
                System.out.print(i+". ");
                String fileName = strInput.nextLine();
                File[] files = Folder.listFiles();
                for(File f2:files){
                    //al.add(f2.getName().toLowerCase());
                    al.add(f2.getName());
                }
                //while(al.contains(fileName.toLowerCase())){
                    while(al.contains(fileName)){
                    System.out.println("File with the same name already exists.");
                    System.out.print("Please enter a different filename:  ");
                    fileName = strInput.nextLine();
                }
                File file = new File(PathOfFolder+File.separator+fileName);
                file.createNewFile();
            
            }
            System.out.println("all files are created successfully");

        // Showing the file present in this Directory
        //File Folder = new File(PathOfFolder);
        if(Folder.isDirectory()){
        File[] files = Folder.listFiles();
            //System.out.println(Arrays.toString(files));
            if(files != null && files.length > 0){
                System.out.println("Folder contains the following files:");
                for(File file1 : files){
                    System.out.println(file1.getName());
                    //file1.delete();
                }
            }
            else{
                System.out.println("Folder is empty");
            }
        }
        else{
            System.out.println("Directory doesn't exist or Not a Directory");
        }
        System.out.println("Enter the name of file you want to delete");
        String delFile = strInput.nextLine();
        File fileToDelete = new File(Folder,delFile);
        if(fileToDelete.exists()){
            fileToDelete.delete();
            System.out.println(fileToDelete+"File deleted successfully");
        }
        System.out.println("Enter filename to find from the directory");
        String searchFile = strInput.nextLine();
        File fileToSearch = new File(Folder,searchFile);
        if (fileToSearch.exists() && fileToSearch.isFile()) {
            System.out.println("Please find the File details below:");
            System.out.println("Name: " + fileToSearch.getName());
            System.out.println("Path: " + fileToSearch.getAbsolutePath());
            System.out.println("Size: " + fileToSearch.length() + " bytes");
        } else {
            System.out.println("The specified file does not exist.");
        }
        intInput.close();
        strInput.close();
    }
}
