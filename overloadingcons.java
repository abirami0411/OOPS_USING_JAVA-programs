import java.util.*;

class sum1
{
	sum1(int a,int b)
	{
		System.out.println("sum: " + (a+b));
	}
	sum1(int a,int b,int c)
	{
		System.out.println("sum: " + (a+b+c));
	}
	void num(int a,int b)
	{
		System.out.println("num: " + (a+b));
	}
	void num(int a,int b,int c)
	{
		System.out.println("num: " + (a+b+c));
	}
}
class overloadingcons
{
	public static void main(String args[])
	{
		sum1 s=new sum1(1,2,3);
		s.num(1,2);
	}
}