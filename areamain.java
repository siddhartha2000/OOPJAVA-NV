import java.util.*;

class shape
{
	int a;
	int b;
	void printarea()	
	{}
}

class triangle extends shape
{	
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.println("Enter the base and height ");
	a = s.nextInt();
	b = s.nextInt();
	area=0.5*a*b;
	System.out.println("Area of triangle is: "+area);
	}
}

class rectangle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.println("Enter the length and breadth  ");
	a = s.nextInt();
	b = s.nextInt();
	area=a*b;
	System.out.println("Area of rectangle is: "+area);
	}
}


class  circle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.println("Enter the radius  ");
	a = s.nextInt();
	area=3.14*a*a;
	System.out.println("Area of circle is: "+area);
	}
}


class areamain
{
public static void main(String a[])
{
	rectangle r=new rectangle();
	r.printarea();
	triangle t = new triangle();
	t.printarea();
	circle c = new circle();
	c.printarea();
}
}
