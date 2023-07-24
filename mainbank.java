import java.io.*;
import java.util.*;
class mybank
{
Scanner sc=new Scanner(System.in);
void manager()
{
int id=sc.nextInt();
if(id==1)
{
System.out.println("Hari");
System.out.println("2002");
}
}
}
class customer extends mybank
{
void customer()
{
int id=sc.nextInt();
if(id==2)
{
System.out.println("customer1");
System.out.println("2003");
}
else
{
System.out.println("wrong");
}
}
}
class mainbank
{
public static void main(String args[])
{
customer c=new customer();
System.out.println("Enter manager id");
c.manager();
System.out.println("Enter customer id");
c.customer();
}
}