import java.io.*;
import java.util.*;
class zigzag
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size");
int temp,j=0;
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
if(i%2==0)
{
b[i]=a[j];
}
if(i%2!=0)
{
b[i]=a[n-1-j];
j++;
}
}
for(int i=0;i<n;i++)
{
System.out.println(b[i]);
}
}
} 
