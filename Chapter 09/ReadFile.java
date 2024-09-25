import java.io.FileInputStream;
class ReadFile
{
 public static void main( String args[])
 {
	  try{
 		FileInputStream fi=new FileInputStream("prog.txt");
 		int n=0;
 			while((n=fi.read())!=-1)
 				{
 				System.out.print((char)n);
 				}
		System.out.println("");
 		fi.close();
		}
		catch(Exception e){System.out.println(e);}

 }
}
