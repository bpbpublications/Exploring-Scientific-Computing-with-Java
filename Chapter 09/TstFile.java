import java.io.File;
import java.io.IOException;

public class TstFile
{
   public static void main( String[] args )
   {
      try {
File f = new File("C:\\java resources\\chapter 9\\newFile.txt");

//File f = new File("C:/j2sdk1.4.1_02/bin/newFile.txt");

System.out.println(f.exists());

/*If file gets created then the createNewFile() method would return true or if the file is already present it would return false */

boolean fvar = f.createNewFile();

if (fvar){
	       	System.out.println("File has been created successfully");
	     		System.out.println(f.exists());

}
	     else{
	   System.out.println("File already present at the specified location");
	     }
    	} catch (IOException e) {
    		System.out.println("Exception Occurred:");
	        e.printStackTrace();
	  }
   }
}
