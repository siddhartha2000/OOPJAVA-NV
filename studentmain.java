class student
{
	int stdno;
	int stage;
}
class studentmain
{
	public static void main(String arg[])
	{
		student s=new student();
		s.stdno=10;
		s.stage=20;
		System.out.println(s.stdno + " " + s.stage);
	}
}
