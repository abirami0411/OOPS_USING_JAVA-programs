import java.io.*;
import java.util.*;
public class leader
{
    
    void function(int a[],int n)
    {
        for(int i=0;i<n;i++)
		{
		    int count=0;
		    int count1=0;
		    for(int j=i+1;j<n;j++)
		{
		    count1++;
		    if(a[i]>=a[j])
		    {
		        count++;
		    }
		}
		if(count==count1)
		{
		    System.out.printf("%d ",a[i]);
		}
		}
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		Main ob=new Main();
		ob.function(a,n);
	}
}