import java.util.*;

class T5
{
public static void main(String args[])
{
 char c,x,d;
int i,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String a=sc.nextLine();
int n=a.length();
System.out.println(n);
for(i=0;i<n;i++)
{
c=a.charAt(i);
d=a.charAt(n-1-i);
s=(int)c + (int)d -96;
x=(char)s;
System.out.print(x);
}
}
}