import java.io.*;
import java.util.*;
class onlyoneswap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("Enter the two strings");
String a=sc.nextLine();
String b=sc.nextLine();
char n[]=a.toCharArray();
char m[]=b.toCharArray();
for(int i=0;i<n.length;i++)
{
if(n[i]!=m[i])
{
count++;
}
}
if(count==2)
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}

