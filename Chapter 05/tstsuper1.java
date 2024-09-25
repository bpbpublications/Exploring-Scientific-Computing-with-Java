 class A
{
 A()
{
String s="Hello";
System.out.println(s);
}
}

class B extends A
{

B()
{
super();
String s="Hii";
System.out.println(s);
}
}
class tstsuper1
{
    public static void main(String[] args)
    {
        B obj = new B();

    }
}