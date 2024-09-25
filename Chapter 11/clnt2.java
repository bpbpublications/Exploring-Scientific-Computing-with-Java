import java.io.*;
import java.net.*;
class clnt2
{
public static void main(String s[])
{
String st="";
try{
Socket skt=new Socket("localhost",1234);
PrintWriter out=new PrintWriter(skt.getOutputStream(),true);
/*System.out.print("Sending String: "+"\n");
out.print(msg);*/
FileReader f=new FileReader("f.txt");
BufferedReader b=new BufferedReader(f);

while((st=b.readLine())!=null)
{
out.print(st);

}
out.close();
}
catch(FileNotFoundException e){}
catch(Exception e)
{
System.out.print("Unsuccessfull\n");
}

}
}

