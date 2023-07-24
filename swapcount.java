import java.io.*;
import java.util.*;
class swapcount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
int temp;
System.out.println("Enter array");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
count++;
}
}
}
System.out.println(count);
}
}