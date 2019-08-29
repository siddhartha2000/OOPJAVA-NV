import java.util.*;
class studentinfo
{
	
	double marks[];
	String grade[];
	int gradepoint[];
	int credits[];
	
	void setdata()
	{
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter marks of subject" + " " + (i+1) + " :");
			marks[i]=s1.nextInt();
			if(100>=marks[i] && marks[i]>90)
			{
				grade[i]="S";
				gradepoint[i]=10;
			}
			else if(90>=marks[i] && marks[i]>75)
			{
				grade[i]="A";
				gradepoint[i]=9;
			}
			else if(75>=marks[i] && marks[i]>60)
			{
				grade[i]="B";
				gradepoint[i]=8;
			}
			else if(60>=marks[i] && marks[i]>50)
			{
				grade[i]="C";
				gradepoint[i]=7;
			}
			else if(50>=marks[i] && marks[i]>40)
			{
				grade[i]="D";
				gradepoint[i]=6;
			}
			else 
			{
				grade[i]="F";
				gradepoint[i]=0;
			}
		}
		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter credit of subject" + " " + (i+1) + " :");
			credits[i]=s1.nextInt();
		}	
		
	}
	void display(double d)
	{
		System.out.println("The SGPA is" + " " + d);
	}
	double sgpa()
	{
		double sgpa1=0;
		for(int i=0;i<5;i++)
		{
			sgpa1+=(double)(gradepoint[i]*credits[i]);
		}
		sgpa1=sgpa1/20;		
		return sgpa1;
	}
}
class sgpamain
{
	public static void main(String argX[])
	{
		studentinfo o1=new studentinfo();
		o1.setdata();
		double d1=o1.sgpa();
		o1.display(d1);
	}
}


