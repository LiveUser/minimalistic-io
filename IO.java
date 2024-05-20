import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

//https://www.w3schools.com/java/java_files.asp

public class IO {
    //Print statement
    public static void print(String string){
        System.out.println(string);
    }
    //Create file
    public static boolean createFile(String filePath) throws IOException{
        File file = new File(filePath);
        File folders = new File(filePath.substring(0, filePath.lastIndexOf("/")));
        //Automatically create all folders in path
        folders.mkdirs();
        //Create file
        return file.createNewFile();
    }
    //File exists
    public static boolean fileExists(String filePath){
        File file = new File(filePath);
        return file.exists();
    }
    //Read as String
    public static String readAsString(String filePath) throws FileNotFoundException{
        String data = "";
        File file = new File(filePath);
        Scanner myScanner = new Scanner(file);
        while (myScanner.hasNextLine()) {
            data += myScanner.nextLine();
        }
        myScanner.close();
        
        return data;
    }
    //Write as String
    //Create file
    public static void writeAsString(String filePath, String data) throws IOException{
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(data);
        fileWriter.close();
    }
    //Read as bytes
    
    //Write as bytes

    //List folder contents
    public static File[] listDirectoryContents(String dirPath){
        File folder = new File(dirPath);
        return folder.listFiles();
    }
    //Delete file
    public static boolean deleteFile(String filePath){
        File file = new File(filePath);
        return file.delete();
    }
    private static void deleteRecursively(String dirPath){
        File[] folderContents = listDirectoryContents(dirPath);
        for(File file : folderContents){
            if(file.isFile()){
                file.delete();
            }else{
                deleteRecursively(file.getPath());
                file.delete();
            }
        }
    }
    //Delete directory
    public static boolean deleteDirectory(String dirPath){
        File file = new File(dirPath);
        //Use recursion to delete files one by one
        deleteRecursively(dirPath);
        return file.delete();
    }
    //Get user input as String
    public static String getInputAsString(){
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();
        return data;
    }
}