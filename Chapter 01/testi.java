
abstract class A
{
int C=10;
abstract void calculate();
}
class B extends A
{
void calculate()
{
System.out.println("The calculated value is ");
System.out.println(C+10);
}
}
class testi
{
public static void main(String s[])
{
B objB=new B();
objB.calculate();
}
}