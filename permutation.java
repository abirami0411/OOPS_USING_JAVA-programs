import java.io.*;
import java.util.*;
class permu
{
public static void main(String args[])
{
int n,i,t,k=0,flag=0,flag1=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Array elements ");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();  
}
for(i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
{
flag=1;
}
else
{
flag=0;
break;
}
}
for(i=0;i<n-1;i++)
{
if(a[i]>a[i+1])
{
flag1=1;
}
else
{
flag1=0;
break;
}
}
if(flag==1)
{
temp=a[n-1];
a[n-1]=a[n-2];
a[n-2]=temp;
for(i=0;i<n;i++)
{
System.out.print(a[i]+" "); 
}
}
if(flag1==1)
{
temp=a[n-1];
a[n-1]=a[0];
a[0]=temp;
for(i=0;i<n;i++)
{
System.out.print(a[i]+" "); 
}
}
}
}