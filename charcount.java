/*import java.io.*;
import java.util.*;
class charcount
{
public static void main(String args[])
{
int s=26;
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
String str=sc.nextLine();
int s=26;
char a[]=str.toCharArray();
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(a[i]==a[j])
{
count++;
}
else
{
j++;
}
}
System.out.println(a[i]+"-"+count);
count=0;
}
 int n = str.length();
        int[] freq = new int[s];
        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
}
}*/
import java.util.*;

public class charcount{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j=0,n,k=0,ct=0,temp;
char temp1;
String str=sc.nextLine();
n=str.length();
char a[]=str.toCharArray();
char b[]=new char[n];
int c[]=new int[n];
Arrays.sort(a);
sc.close();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]==a[j])
{
if(i>0&&a[i]!=b[k])
{
k++;
ct=0;
}
b[k]=a[i];
c[k]=++ct;
a[j]=0;
}
}
}
for(i=0;i<=k;i++)
{
for(j=i+1;j<=k;j++)
{
if(c[i]<c[j])
{
temp=c[i];
c[i]=c[j];
c[j]=temp;
temp1=b[i];
b[i]=b[j];
b[j]=temp1;
}
}
}
for(i=0;i<=k;i++)
{
if(c[i]==c[i+1])
{
if(b[i]<b[j])
{
temp1=b[i];
b[i]=b[j];
b[j]=temp1;
temp=c[i];
c[i]=c[j];
c[j]=temp;
}
}
}
for(i=0;i<=k;i++)
{
System.out.printf("%c  %d\n", b[i],c[i]);
}
}
}

