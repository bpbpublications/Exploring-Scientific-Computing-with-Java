
class Test_Overload
{
void testAdd(int a, int b)
{
System.out.println(a+b);
}
void testAdd(int a,int b,int c)
{
System.out.println(a+b+c);
}
}
class test3
{
public static void main(String args[])
{
Test_Overload t=new Test_Overload();
System.out.println("The value after addition of two numbers");
t.testAdd(10,20);
System.out.println("The value after addition of three numbers");
t.testAdd(30,40,50);
}
}