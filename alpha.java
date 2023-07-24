import java.io.*;
import java.util.*;
import java.util.Arrays;
class alpha
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
char []a=s.next().tocharArrays();
int n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
if(a[i]==a[j])
{
System.out.println("\n");
System.out.println(a[j]);
}
}
}
}