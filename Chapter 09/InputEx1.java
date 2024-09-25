import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx1
{
    public static void main(String[] args) throws IOException
    {


        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		String name = rd.readLine();
        System.out.println("The name is  "+name);
    }
}