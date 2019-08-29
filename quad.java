import java.util.*;
class quad
{
    public static void main(String x1[])
    {
        Scanner s1 = new Scanner(System.in);
        
	System.out.println("Enter a , b and c");
	double a =s1.nextInt();
	double b =s1.nextInt();
	double c =s1.nextInt();
	double d =Math.sqrt((b*b-(4*a*c)));
	double root1=(-b+d)/(2*a);
	double root2=(-b-d)/(2*a);
	System.out.println("The roots are" + ":" + root1 + " " + " and " + root2);
	
	
    }
}
