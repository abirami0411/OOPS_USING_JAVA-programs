import java.io.*;
import java.util.Arrays;
class intersection
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int b[]={4,5,6,7,8};
int n=a.length;
int m=b.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if(a[i]==b[j])
{
System.out.print(a[i] );
}
}
}
}
}
