class A
{
	String st="Fish";
void eat()
{
System.out.println("A is eating "+st);
}
}

class B extends A
{
void think()
{
System.out.println("B is thinking about "+st);
}
}

class tstInht
{
public static void main(String args[])
{
B b=new B();
b.eat();
b.think();

}
}