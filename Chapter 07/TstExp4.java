 class TstExp4
{
public static void main(String args[]) {

try
{
int c[] = { 1 ,2};
System.out.println(c.length);
c[1] = 99;

int a = 0;
int b = 42 / a;

}
catch(Exception e)
{
System.out.println(e);
}


System.out.println("After try/catch blocks.");
}
}


/*

In some cases, more than one exception could be raised by a single piece of code.
To handle this type of situation, you can specify two or more catch clauses,
each catching a different type of exception.
When an exception is thrown, each catch statement is inspected in order,
and the first one whose type matches that of the exception is executed.
After one catch statement executes, the others are bypassed, and execution
continues after the try/catch block.

*/