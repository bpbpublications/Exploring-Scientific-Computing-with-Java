class TstFinal {
public static void main(String args[]) {
try {
 int k=10/0;
}
catch (ArithmeticException ae) {
System.out.println("Exception caught");
}
finally{
System.out.println("Finally");
}
System.out.println("last statement");
}
}

