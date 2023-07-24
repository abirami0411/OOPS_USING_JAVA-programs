import java.io.*;
import java.util.*;
class rotatetimes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0,temp;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int min=a[0];
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
j++;
count++;
}
}
}
System.out.println("The array is rotated"+" "+count+" "+"times");
}
}
