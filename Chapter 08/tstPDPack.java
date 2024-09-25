import java.util.Scanner;  // Import the Scanner class

class tstPDPack {
  public static void main(String[] args) {
    Scanner mobj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the name");

    String urName = mobj.nextLine();  // Read user input
    System.out.println("My name is: " + urName);  // Output user input
  }
}