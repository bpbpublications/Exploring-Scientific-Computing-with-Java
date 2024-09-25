import java.io.*;
import java.net.*;
class Srvr3
{
public static void main(String s[])
{
String st="By";
try{
ServerSocket srvr=new ServerSocket(1236);
Socket skt=srvr.accept();
System.out.print("Server has connected\n");
PrintWriter out=new PrintWriter(skt.getOutputStream(),true);
BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));
for(int i=0;i<=3;i++)
{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String input = reader.readLine();
if(!input.equalsIgnoreCase(st))
{
	out.println(input);
	System.out.println(in.readLine());

}
else
{
	break;
}
}



out.close();
in.close();
srvr.close();
skt.close();
}
catch(Exception e)
{
System.out.print("Unsuccessfull\n");
}

}
}
