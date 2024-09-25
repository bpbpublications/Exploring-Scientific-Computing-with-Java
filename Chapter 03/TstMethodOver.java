
class MethodOverDemo
{
public void calDemo()
{
System.out.println("Mehtod without parameters");
}
void calDemo (int x)
{
System.out.println("the value of x: " + x);
}
void calDemo (int x, int y)
{
System.out.println("the value of x and y:"+ x +" " + y);
}
double calDemo (double d)
{
System.out.println("the value of d is " + d);
return d*d;
}
}
public class TstMethodOver
{
public static void main(String args[])
{
MethodOverDemo objT = new MethodOverDemo();
double result;
objT.calDemo();
objT.calDemo (5);
objT.calDemo (15, 25);
result = objT.calDemo (68.6847);
System.out.println("Result of objT.calDemo (68.6847) is : "+ result);
}
}