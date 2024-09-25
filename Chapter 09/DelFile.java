import java.io.File;  // Import the File class

public class DelFile {
  public static void main(String[] args) {
    File myObj = new File("SampleFile1.txt");
    if (myObj.delete()) {
      System.out.println("The file is deleted: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    }
  }
}
