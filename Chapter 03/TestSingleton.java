class SingletonEx
{
// static variable single_instance of type SingletonEx
private static SingletonEx single_instance = null;

// variable of type String that is "st"
public String st;

// private constructor "SingletonEx()" restricted to this class itself
private SingletonEx()
{
st = "Good morning. We are in Singleton class";
}

// static method "getInstance()" to create instance of SingletonEx class
public static SingletonEx getInstance()
{
if (single_instance == null)
single_instance = new SingletonEx();

return single_instance;
}
}

public class TestSingleton{

     public static void main(String []args){
  
        SingletonEx objS = SingletonEx.getInstance();
        System.out.println("Hello everyone, " + objS.st);
     }
}