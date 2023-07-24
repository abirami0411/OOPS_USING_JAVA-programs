import java.io.*;
import java.util.*;
class frequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int cx=0,cy=0,cz=0;
System.out.println("Enter the string");
String a=sc.nextLine();
char b[]=a.toCharArray();
for(int i=0;i<b.length;i++)
{
if(b[i]=='x')
{
cx++;
}
else if(b[i]=='y')
{
cy++;
}
else if(b[i]=='z')
{
cz++;
}
}
if(cx==cz && cx==cy && cz==cy)
{
System.out.println("Yes");
}
else if(cy==cz && cx<=cy && cx<=cz)
{
System.out.println("Yes");
}
else if(cx==cz && (cx+cz)==cy)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}














