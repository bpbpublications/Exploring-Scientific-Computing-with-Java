import java.io.*;
import java.net.*;
class Svr
{
public static void main(String s[])
{
String msg="Testing........";
try{
ServerSocket srvr=new ServerSocket(1234);
Socket skt=srvr.accept();
System.out.print("Server has connected");
PrintWriter out=new PrintWriter(skt.getOutputStream(),true);
System.out.print("Sending String: "+msg+"\n");
out.print(msg);
out.close();
skt.close();
srvr.close();
}
catch(Exception e)
{
System.out.print("Unsuccessfull\n");
}

}
}

