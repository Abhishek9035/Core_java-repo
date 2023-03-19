import java.io.*;
public class MultiCatchDemo {

	public static void main(String[] args) {
		
		try
		{
			int arr[]= {2,4};
			int a=0;
			int c=arr[1]/a;
			System.out.println(c);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
	}

}
