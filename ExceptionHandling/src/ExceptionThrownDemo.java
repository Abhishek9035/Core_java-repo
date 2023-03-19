import java.io.*;
public class ExceptionThrownDemo {
	
	static int divide(int a,int b)
	{
		int i=a/b;
		return i;
	}
	
	static int  display(int a,int b)
	{
		int res=0;
		try
		{
			res=divide(a,b);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		return res;
	}
		
	public static void main(String[] args) {
		
		int a=1;
		int b=0;
		try
		{
			int i=display(a,b);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
