import java.io.*;
import java.util.*;
class singlesum
{
public static void main(String args[])
{
int sum=0,rem;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
while(num/10!=0)
{
sum=0;
while(num!=0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
num=sum;
}
System.out.println(sum);
}
}