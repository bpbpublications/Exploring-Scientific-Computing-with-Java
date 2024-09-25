
class test_A
{
void disp()
{
System.out.println("Inside test_A");
}
}
class test_B extends test_A
{
void disp()
{
System.out.println("inside test_B");
}
}
class test4
{
public static void main(String args[])
{
test_B Obj=new test_B();
Obj.disp();
}
}