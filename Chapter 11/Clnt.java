import java.io.*;
import java.net.*;
class Clnt
{
public static void main(String s[])
{
try{
Socket skt=new Socket("localhost",1234);
BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));
System.out.print("Received msg");
while(!in.ready())
{
}
System.out.println(in.readLine());
System.out.print("\n");
in.close();
}
catch(Exception e)
{
System.out.print("Unsuccessfull\n");
}

}
}
