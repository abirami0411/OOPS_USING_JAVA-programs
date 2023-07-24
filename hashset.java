import java.io.*;
import java.util.*;
class hashset 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
LinkedHashSet<Integer> bag =new LinkedHashSet<Integer>();
for(int i=0;i<n;i++)
{
System.out.println("Enter m");
int m=sc.nextInt();
for(int j=0;j<m;j++)
{
System.out.println("Character");
char c=sc.next().charAt(0);
switch(c)
{
case 'a':
{
bag.add(sc.nextInt());
break;
}
case 'b':
{
System.out.println("List "+bag);
break;
}
case 'c':
{
n=sc.nextInt();
if(bag.contains(n))
{
bag.remove(n);
}
else
{
System.out.println("-1");
}
break;
}
case 'd':
{
if(bag.contains(sc.nextInt()))
{
System.out.println("1");
}
else
{
System.out.println("-1");
}
break;
}
case 'e':
{
System.out.println("Size of bag = "+ bag.size());
break;
}
case 'f':
{
System.out.println("List "+bag);
break;
}
case 'x':
{
int choice=0;
break;
}
default:
{
}
}
}
}
}
}