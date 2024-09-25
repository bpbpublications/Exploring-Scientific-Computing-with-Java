
class ConsOver
{
ConsOver (int a, int b)
{
int c= a+b;
System.out.println("The result of addition of two integer values is "+ c );
}
ConsOver (double m, double n)
{
double p= m * n;
System.out.println("The result of multiplication of two double values is "+ p );
}
}
class TestCons
{
public static void main(String args[])
{
ConsOver obj1=new ConsOver(10,15);
ConsOver obj2=new ConsOver(4.56,6.58);
}
}