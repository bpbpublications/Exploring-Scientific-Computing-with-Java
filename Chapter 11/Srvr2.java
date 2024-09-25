import java.io.*;
import java.net.*;
class Srvr2
{
public static void main(String s[])
{
int i;
try{
ServerSocket srvr=new ServerSocket(1234);
Socket skt=srvr.accept();
FileOutputStream f=new FileOutputStream("t1.txt");
BufferedOutputStream r=new BufferedOutputStream(f);
BufferedInputStream bi=new BufferedInputStream(skt.getInputStream());
System.out.print("Server has connected");
BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));
System.out.print("\nReceived file "+"\n");
while(!in.ready())
{
}
while((i=bi.read())!=-1)
{
f.write(i);
}

in.close();
skt.close();
srvr.close();
f.close();
r.close();
bi.close();

}
catch(FileNotFoundException e){}
catch(Exception e)
{
System.out.print("Unsuccessfull\n");
}

}
}


