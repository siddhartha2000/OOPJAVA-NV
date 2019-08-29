import java.util.*;
class time
{
	int hrs;
	int min;
	
	void setdata()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input hours and minutes");
		hrs=s1.nextInt();
		min=s1.nextInt();
	}
	void printdata()
	{
		System.out.println("Hours = "  + hrs + " "  + " minutes = " + " "  + min);
	}
	time add(time t1)
	{
		time t2=new time();
		t2.hrs = t1.hrs + hrs;
		t2.min = t1.min + min;
		if(t2.min>60)
		{
			t2.min%=60;
			t2.hrs++;
		}
		return t2;	
	}

}
class timemain
{
	public static void main(String argX[])
	{
		time o1=new time();
		time o2=new time();
		time o3=new time();
		o1.setdata();
		o2.setdata();
		o1.printdata();
		o2.printdata();
		o3=o1.add(o2);
		o3.printdata();
	}
}

