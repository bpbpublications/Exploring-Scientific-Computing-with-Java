abstract class A
{  
int b=10;
abstract void disp();
}  

class B extends A
{  
void disp()
{
System.out.println("hii "+b);
}

}

class tstabs
{
public static void main(String args[])
{ 
B ob = new B();  
ob.disp();  

  
}  
}

  