
interface I
{
int A=10;
void f();
}
class C implements I
{
public void f()
{
System.out.println("The value of A is "+A);
}
}
class test2
{
public static void main(String s[])
{
C obj=new C();
obj.f();
}
}