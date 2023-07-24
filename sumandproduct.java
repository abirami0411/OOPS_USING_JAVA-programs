import java.io.*;
import java.util.*;
class test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter N value");
int N=sc.nextInt();
System.out.println("Enter Q value");
int Q=sc.nextInt();
int sum=0;
int product=1;
if(Q==1)
{
for(int i=1;i<=N;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
else if(Q==2)
{
for(int i=1;i<=N;i++)
{
product=product*i;
}
System.out.println(product);
}
else
{
System.out.println("Enter the crt Q value");
}
}
}