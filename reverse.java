import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int r;
System.out.println("the reverse is");
while(a!=0)
{
r=a%10;
a=a/10;
System.out.printf("%d",r);
}

}
}