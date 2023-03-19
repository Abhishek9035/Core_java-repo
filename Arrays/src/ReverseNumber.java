import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		/*int a[]=new int[5];   (reverse an array)
		for(int i=0;i<5;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		for(int i=4;i>=0;i--)
		{
			System.out.print(i);
		} */
		
		int num=521;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
}
}
