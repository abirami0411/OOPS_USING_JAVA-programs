import java.io.*;
import java.util.*;
class greatest3instr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char a[]=s.toCharArray();
char b[]=new char[a.length];
for(int i=0;i<a.length;i++)
{
b[i]=a[i];
}
char max=a[0],temp;
for(int i=0;i<a.length;i++)
{
if(max<a[i])
{
temp=max;
max=a[i];
a[i]=temp;
}
}
System.out.println(max);
for(int i=0;i<a.length;i++)
{
if(b[i]==max)
{
System.out.print(max);
System.out.print(b[i+1]);
System.out.print(b[i+2]);
}
}
}
}
