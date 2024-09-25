class TstExp3{
public static void main(String args[])
{
int d=0, a;


try
{
d = 0;
a = 42 / d;

System.out.println("This will not be printed.");
}
catch(ArithmeticException e)
{
System.out.println("Division by zero." + e);
}



System.out.println("After catch statement.");



}
}

/*
To guard against and handle a run-time error, simply enclose the code that you want to monitor inside a try block.
Immediately following the try block, include a catch clause that specifies the exception type that you wish to catch.
Notice that the call to println( ) inside the try block is never executed
*/