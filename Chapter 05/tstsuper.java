class A
{
void disp()
{
System.out.println("Inside class A");
}
}
class B extends A
{
void disp()
{
System.out.println("Inside class B");
super.disp();
}
}
class tstsuper
{
 public static void main(String args[])
{
 B f1=new  B();
   f1.disp();
 }
}