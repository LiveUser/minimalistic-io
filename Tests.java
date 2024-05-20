import java.io.FileNotFoundException;
import java.io.IOException;

public class Tests {
  public static void main(String[] args) {
    String filePath = "./database/file.txt";
    String data = IO.getInputAsString();
    //Test 1
    IO.print("Hello World print test");
    //Test 2
    try{
      IO.createFile(filePath);
    }catch(IOException error){
      IO.print(error.getMessage());
    }
    try{
      IO.writeAsString(filePath, data);
    }catch(IOException error){
      IO.print(error.getMessage());
    }
    try{
      IO.readAsString(filePath);
    }catch(FileNotFoundException error){
      IO.print(error.getMessage());
    }
    //IO.deleteFile(filePath);
    IO.deleteDirectory("./database");
  }
}
