import java.io.*;
import java.util.*;
class gettingarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println("the elements" +a[i]);
}
}
}


