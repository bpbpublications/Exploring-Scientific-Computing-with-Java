class Student
{
int roll;
String name;
String stream_name;
void get_details()
{
System.out.println("The student "+name+" with roll "+roll +" Studied in "+stream_name);
}
}


public class StdClass{
public static void main(String[] args)
{
Student std1=new Student();
std1.roll=1;
std1.name="Sudip";
std1.stream_name="CSE";
std1.get_details();
Student std2=new Student();
std2.roll=2;
std2.name="Sandip";
std2.stream_name="IT";
std2.get_details();
}
}