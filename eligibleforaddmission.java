import java.io.*;
import java.util.*;
class admission
{
public static void main(String args[])
{
int a=67;
int b=51;
int c=72;
if((a>=65) && (b>=55) && (c>=50) && ((a+b+c)>=180)) 
{
System.out.println("eligible");
}
else if((a+b)>=140)
{
System.out.println("eligible");
}
else {
System.out.println("not eligible");
}
}}