import java.io.*;
import java.util.*;
class posneg
{
public static void main(String args[])
{
int a[]={1,-2,-3,-5,-7,9};
int n=a.length;
int count=0;
int cont=0;
for(int i=0;i<n;i++)
{
if(a[i]>0)
{
count++;
}
else
{
cont++;
}
}
if(count>cont)
{
System.out.print("False");
}
else
{
System.out.print("True");
}
}
}