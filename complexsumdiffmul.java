import java.io.*;
import java.util.Scanner;

class complexsumdiffmul{
public static void main(String args[]){
int a,ai,b,bi;
int s,si,d,di,m,mi;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the a and ai :");
a=sc.nextInt();
ai=sc.nextInt();

System.out.println("Enter the b and bi :");
b=sc.nextInt();
bi=sc.nextInt();

System.out.println("the 1st cmplex number:"+a +" + "+ai+"i");
System.out.println("the 2nd cmplex number:"+b +" + "+bi+"i");
//sum
s=a+b;
si=ai+bi;
System.out.println("the sum is:"+ s +" + "+ si +"i");
//diff
d=a-b;
di=ai-bi;
System.out.println("the difference is:"+ d +" + "+ di +"i");
//multi;
m=((a*b)+(-(ai*bi)));
mi=((ai*b)+(a*bi));
System.out.println("the multiplication is:"+ m +" + "+ mi +"i");

}}