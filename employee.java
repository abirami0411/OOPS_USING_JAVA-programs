import java.io.*;
import java.util.*;
abstract class employee_details
{
abstract Void display();
}
class employee_name extends employee_details
{
void show()
{
Scanner s=new Scanner(System.in);
System.out.println("Name");
String s1=s.nextLine();
String s2=s.nextLine();
String s3=s.nextLine();
System.out.println("Year Of Joining");
int y1=s.nextInt();
int y2=s.nextInt();
int y3=s.nextInt();
System.out.println("Address");
String a1=s.nextLine();
String a2=s.nextLine();
String a3=s.nextLine();
}
}
class employee
{
public static void main(String args[])
{
employee_details emp=new employee_name();
emp.display();
}
}