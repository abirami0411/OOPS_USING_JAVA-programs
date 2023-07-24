import java.util.*;
import java.util.Scanner;
public class matrix
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("No. of Friends");
    	int n = sc.nextInt();
		System.out.println("The Friends are");
    	int[] arr = new int[n];
    	int i;
    	for (i = 0; i < n; i++)
    	{
        	arr[i] = sc.nextInt();
    	}
    	int count = 0;
    	for (i = 0; i < n; i++)
    	{
        		if (arr[i] == arr[0])
{
            		count++;
        		}
    	}
    	System.out.println(n-count);
    }
}
