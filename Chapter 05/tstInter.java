abstract interface I
{
int a=15;
void f();
}
interface J
{
int b=20;
void f();
}
class C implements I,J
{
public void f()
{
System.out.println(a);
}
public void f1()
{
System.out.println(b);
}

}

class tstInter
{
public static void main(String s[])
{
C obj=new C();
obj.f();
obj.f1();
}
}