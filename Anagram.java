import java.io.*;
import java.util.*;
class test5
{
public static void main(String args[])
{
int n=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String1");
String str1=sc.nextLine();
System.out.println("Enter the String2");
String str2=sc.nextLine();
char a1[]=new char[100];
a1=str1.toCharArray();
char a2[]=new char[100];
a2=str2.toCharArray();
for(int i=0;i<a1.length;i++)
{
 if(a1[i]==a2[i])
{
 System.out.print("");
}
else if(a1[i]!=a2[i])
{
 n=n+1;
}
}  
System.out.println("the manipulation is");
System.out.println(n);
}
}