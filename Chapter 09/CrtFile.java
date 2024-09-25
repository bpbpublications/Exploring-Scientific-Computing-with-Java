import java.io.File;
import java.io.IOException;
public class CrtFile {
  public static void main(String[] args) {
    try {
      File mObj = new File("SampleFile");
      if (mObj.createNewFile()) {
        System.out.println("File is created: " + mObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error has occurred.");
      e.printStackTrace();
    }
  }
}
