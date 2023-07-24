import java.io.*;
import java.util.*;
class duplicate
{
public static void main(String args[])
{
int a[]={1,2,3,4,3,5};
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
System.out.print(a[i]);
}
}
}
}
}