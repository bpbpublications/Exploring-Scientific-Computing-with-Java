class TstExp7 {
static void cal(int i)
{
if (i==5)
{
throw new ArithmeticException("Divide by 0 error occured");
}
else
{
System.out.println("Its ok");

}
}

public static void main(String args[]) {

try
{
cal(5);
}
catch(ArithmeticException e)
{

System.out.println(e);
}





}
}

//ArithmeticException e=new ArithmeticException("Divide by 0 error occured");
