class A
{
void eat()
{
System.out.println("A is eating");
}
}
class B extends A
{
void think()
{
System.out.println("B is thinking");
}
}
class C extends A
{
void join()
{
System.out.println("C is joining");
}
}
class tstInht2
{
public static void main(String args[])
{
B b=new B();
b.eat();
C c=new C();
c.eat();
c.join();
}
}