import java.io.*;
import java.util.*;
class maxsumdiff
{
static int maxdiff(int arr[], int n)
{
int subset1=0;
int subset2=0;
for(int i=0;i<n;i++)
{
boolean occurence=true;
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
occurence=false;
arr[i]=arr[j]=0;
break;
}
}
if(occurence)
{
if(arr[i]>0)
{
subset1+=arr[i];
}
else
{
subset2+=arr[i];
}
}
}
return subset1-subset2;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(maxdiff(arr,n));
}
}





