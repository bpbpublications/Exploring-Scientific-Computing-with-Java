class A{
  void disp()
  {
  System.out.println("In class A ");
  }
}


class B extends A{
  void disp()
  {
  System.out.println("In class B ");
  }
}


class Tstover
{
  public static void main(String args[]){
   B objB = new B();
   objB.disp();
  }
}