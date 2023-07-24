import java.io.*;
import java.util.*;
class If
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
if((a%2)==0)
{
System.out.println("the no"+ a + "is even");
}
else
{
System.out.println("the no" + a +"is odd");
}}}