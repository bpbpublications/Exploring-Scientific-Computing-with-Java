abstract class A {
    int a;
    public A(int a)
    {
        this.a = a;
    }
        abstract int multiply(int val);
}
class B extends A {
    B()
    {
        super(2);
    }
    public int multiply(int val)
    {
        return this.a * val;
    }
}
public class AbsCons {
    public static void main(String args[])
    {
        A a= new B();
        System.out.println("The multiplied value is "+a.multiply(3));
    }
}