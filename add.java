import java.util.*;
class add
{
	public static void main(String xx[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 2 no.");
		int x =s1.nextInt();  // method inside class scanner
		int y=s1.nextInt();
		int z=x+y;
		System.out.println(x + " + " + y + " = " + z);
		int a[]=new int[10];
		int b[]={10,20,30,40,50};
		for (int i=0;i<5;i++)
		{
			System.out.println(b[i] + " " );
		}
		System.out.println("Enter no. of elements");
		int n=s1.nextInt();
		System.out.println("Enter" + n + "Elements:");
		int c[]=new int[n];
		for(int i=0 ; i<n ; i++)
		{
			c[i]=s1.nextInt();
			a[i]=c[i];
		}
		System.out.println("Array a:");
		for(int i=0; i<n ; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println("Array b:");
		for(int y1:b) // for each loop
		{
			System.out.println(y1 + "");
		}
		System.out.println("Array c:");
		for(int i=0; i<n ; i++)
		{
			System.out.println(c[i] +  "");
		}
	}
}				
