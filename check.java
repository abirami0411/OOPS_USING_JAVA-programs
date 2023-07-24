import java.io.*;
import java.util.*;
class check
{
public static void main(String args[])
{
int a[]={50,77,12,54,-11};
int n=a.length;
for(int i=0;i<n;i++)
{
if(a[i]==0||a[i]==-1)
{
System.out.print("false");
break;
}
else
{
System.out.print("True");
break;
}
}
}
}