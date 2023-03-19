import java.util.*;
public class ArraysDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of element of array");
		int n=sc.nextInt();
		String a[]=new String[n];
		int i=0;
		do
		{
			 a[0]="1";
			 a[1]="2";
			 a[2]="3";
			 
		}while(a.length>n);
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
