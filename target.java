import java.util.*;

class target
{
public static void main(String args[])
{

int i,M=0,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Array elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();  
}
System.out.println("Target= ");
int t=sc.nextInt();
for(i=0;i<n;i++)
{
  if(a[i]==t)
{
M=i;
flag=1;
break;
}  
else
{
flag=0;
}
}
if (flag==1)
{
System.out.println(M);
}
else
{
System.out.println("-1");
}
}
}