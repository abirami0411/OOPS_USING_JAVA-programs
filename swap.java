import java.io.*;
import java.util.*;
class swap
{
public static void main(String args[])
{
int a[]={10,20,30,40,50};
int n=a.length;
int i,j;
a[0]=a[n-1];
for(i=1;i<=n;i++)
{
a[n-1]=a[n-i-1];
}
System.out.print(a[i]);
}
}

