//Checked Exception occurs at compile time error.
import java.io.*;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			FileReader file=new FileReader("file.txt");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		int c=10/2;
		System.out.println(c);

	}

}
