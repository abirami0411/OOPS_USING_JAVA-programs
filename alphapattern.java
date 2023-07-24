import java.io.*;
import java.util.*;
class alphapattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a='E';
char c='A',i,j;
for(i=1;i<=(a -'A'+1);i++)
{
for(j=1;j<=i;j++)
{
System.out.print(c);
}
c++;
System.out.println(" ");
}
}}