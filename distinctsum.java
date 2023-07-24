
import java.util.*;

class distinctSum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,n,a,b;
		n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.print("0 ");
               for(i=1;i<(n/2);i++)
			{
				a=i;
				b=-i;
				System.out.print(a+" "+b+" ");
			}
		System.out.print(n);
		}
		if(n%2!=0)
		{
               for(i=1;i<=(n/2);i++)
			{
				a=i;
				b=-i;
				System.out.print(a+" "+b+" ");
			}
		System.out.print(n);
		}

	}

}