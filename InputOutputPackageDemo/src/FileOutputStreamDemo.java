import java.io.*;
public class FileOutputStreamDemo {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream output=new FileOutputStream("C:\\Users\\y.abhishek.kaki\\Desktop\\IO package\\fileDemo1.txt");
		String data="This is an example of FileOutputStream and FileOutputStream belongs to byte stream";
		byte[] a=data.getBytes();
		output.write(a);
		output.close();
		
		
		
		
	}
}
