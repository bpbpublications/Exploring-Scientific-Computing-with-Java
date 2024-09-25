class father
{
  String lname="Adhikari";
 }

class chld extends father
{
String fname="Subhajit";
  public void display()
  {
    System.out.println("My name is " + fname+" "+lname);
  }
}
class tstIn{
public static void main(String s[]){

chld c1 = new chld();
c1.display();
}
}
