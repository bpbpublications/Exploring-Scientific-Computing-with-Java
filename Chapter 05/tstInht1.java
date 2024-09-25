class A
{  
void eat()
{
System.out.println("A is eating");}  
}  

class B extends A
{  
void think()
{
System.out.println("B is thinking");
}  
}  

class C extends B
{  
void join()
{
System.out.println("C is joining");
}  
}  


class tstInht1
{  
public static void main(String args[])
{  
C c=new C();  
c.think();  
c.eat();
c.join();  
}
}  