import java.io.*;
import java.util.*;
class triplet10
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[]={2, 3, 4};
		int n=a.length;
		int b[]=a;
		int count=0;
		System.out.println("triplet ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int c=a[i]+a[j];
				for(int k=0;k<n;k++)
				{
					if(c==b[k])
						count++;
				}
				System.out.println(+count);
			}
		}
		System.out.println("triplet is "+count);
	}
}