import java.io.FileWriter;
import java.io.IOException;
public class WrtFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("SampleProg1.txt");
      myWriter.write("Welcome to world of java programming");
      myWriter.close();
      System.out.println("The content is successfully written to the file.");
    } catch (IOException e) {
      System.out.println("An error has occurred.");
      e.printStackTrace();
    }
  }
}