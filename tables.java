import java.io.*;
import java.util.*;
class table
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
int a=s.nextInt();
int i;
for(i=1;i<=10;i++)
{
int c=a*i;
System.out.printf("%d*%d=%d\n",a,i,c);
}
}
}