class A
{
int t;
A()
{
t=10; // the vaLue of "t" is initialized by the constructor.
}

}
class Test1
{
public static void main(String args[])
{
A objA=new A();
System.out.println("The value of t is "+ objA.t);
}
}




