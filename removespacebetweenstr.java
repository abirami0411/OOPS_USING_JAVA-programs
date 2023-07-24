import java.util.*;
class removespacebetweenstr 
{
public static void main(String[] args) 
{
String str = " This is an example    ";      
String newStr= str.replaceAll("\\s", "");
System.out.println(newStr);  
}
}
//the op is "Thisisanexample"