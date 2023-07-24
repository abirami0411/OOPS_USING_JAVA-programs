import java.io.*;
import java.util.*;
class quadrant
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of x");
int x=s.nextInt();
System.out.println("Enter the value of y");
int y=s.nextInt();
if(x>0 && y>0)
{
System.out.println("1st quardrant");
}
else if(x<0 && y>0)
{
System.out.println("2nd quardrant");
}
else if(x<0 && y<0)
{
System.out.println("3rd quardrant");
}
else if(x>0 && y<0)
{
System.out.println("4th quardrant");
}
else 
{
System.out.println("Enter correct value");
}
}
}