import java.util.Scanner;
class InputEx2
{
    public static void main(String args[])
    {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String st = sc.nextLine();
        System.out.println("You entered string "+st);

        System.out.println("Enter the integer value");
        int k = sc.nextInt();
        System.out.println("You entered integer "+k);

  		System.out.println("Enter the float value");
        float l = sc.nextFloat();
        System.out.println("You entered float "+l);
    }
}
