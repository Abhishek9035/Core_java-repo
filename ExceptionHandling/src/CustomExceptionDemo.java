import java.io.*;
class MyException extends Exception
{
	public MyException(String s)
	{
		System.out.println(s);
	}
}
public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		
		try
		{
			new MyException("LKM");
		}
		catch(Exception e)
		{
			System.out.println("MyException caught");
			System.out.println(e);
		}

	}

}
