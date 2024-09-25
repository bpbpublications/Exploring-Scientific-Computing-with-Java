import cal.*;
import java.util.*;
public class calculate{
public static void main(String args[]){
int ch=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter,\n 1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for Factorial");
ch=in.nextInt();
float a,b;
int c;
switch(ch){
case 1:
	
	System.out.println("Enter the value of operand : ");
	a=in.nextFloat();
	System.out.println("Enter the value of operand : ");
	b=in.nextFloat();
	System.out.println("The Result is : "+add.operation(a,b));
	break;
case 2:
	
	System.out.println("Enter the value of operand  ");
	a=in.nextFloat();
	System.out.println("Enter the value of operand  ");
	b=in.nextFloat();
	System.out.println("The Result is : "+sub.operation(a,b));
	break;
case 3:

	System.out.println("Enter the value of operand  ");
	a=in.nextFloat();
	System.out.println("Enter the value of operand  ");
	b=in.nextFloat();
	System.out.println("The Result is : "+mul.operation(a,b));
	break;
case 4:
	
	System.out.println("Enter the value of operand ");
	a=in.nextFloat();
	System.out.println("Enter the value of operand ");
	b=in.nextFloat();
	System.out.println("The Result is : "+div.operation(a,b));
	break;
case 5:
	
	System.out.println("Enter the value of operand  ");
	c=in.nextInt();
	System.out.println("The Result is : "+fact.operation(c));
	break;
default:
	System.out.println("INVALID OPTION");
	}
}}
