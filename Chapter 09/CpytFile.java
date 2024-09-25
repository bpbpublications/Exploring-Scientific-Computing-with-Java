import java.io.FileOutputStream;
class CpytFile
{
 public static void main( String args[])
 {
	 try
	 {
 		FileOutputStream fos=new FileOutputStream("SampleProg.txt");
 		String s1="We are in the world of java programming";
 		byte b1[]=s1.getBytes(); //converting string into byte array
 		fos.write(b1);
 		System.out.println("The file has been created successfully");
 		fos.close();

     }
catch(Exception e){System.out.println(e);}
 }
}
