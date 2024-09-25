abstract class Shape
{
static String clr="Blue";
static void disp()
{
System.out.println("The color of the shape is " + clr);
}

}
class CShape extends Shape
{
	CShape()
	{
	super.disp();
	}
}
class tstShape
{
	public static void main(String s[])
	{
		CShape sp=new CShape();
	}
}