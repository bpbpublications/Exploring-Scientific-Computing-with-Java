  class tstThis
{
    int a;
    int b;

    tstThis(int a, int b)
    {

        this.a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
  }
  public class ThisKeywordEx
  {
    public static void main(String[] args)
    {
        tstThis obj = new tstThis(17, 15);
        obj.display();
    }
}