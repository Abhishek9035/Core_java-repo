import java.io.*;
public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		FileOutputStream output=null;
		try
		{
			output=new FileOutputStream("File.txt");
			int c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is TryCatchFinal block example");
			b=5;
			int c=a/b;
			System.out.println(c);
		}
		

	}

}
