class A
{
void disp()
{
System.out.println("In A");
}
}
class B extends A
{
void disp()
{
System.out.println("In B");
}
}
class TstDyn
{
public static void main(String s[])
{
A r;

r=new A();
r.disp();
r= new B();
r.disp();
}
}


