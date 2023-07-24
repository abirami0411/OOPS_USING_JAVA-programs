import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
int a[]={23,46,76,89,12};
int l=a[0];
int s=a[0];
int i;
for(i=1;i<=4;i++)
{
if(l<a[i])
{
l=a[i];
}
else if(s>a[i])
{
s=a[i];
}
}
System.out.println(l);
System.out.println(s);
}
}