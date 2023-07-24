import java.io.*;
import java.util.*;
class house
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a[]={'H','.','.','H','.'};
int n=a.length,i;
for(i=0;i<n;i++)
{
if(a[i]=='.')
{
a[i]='b';
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}
}