import java.io.*;
import java.net.*;
class Clnt3
{
public static void main(String s[])
{
String st="By";
try{
Socket skt=new Socket("localhost",1236);

BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));
PrintWriter out=new PrintWriter(skt.getOutputStream(),true);


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
skt.close();

}
catch(Exception e)
{
System.out.print("Unsuccessfull\n");
}

}
}
