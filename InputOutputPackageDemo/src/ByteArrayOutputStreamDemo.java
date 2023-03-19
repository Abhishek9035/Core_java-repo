import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		String str1="This is a example of ByteArrayStreamDemo1";
		String str2="This is a example of ByteArrayStreamDemo2";
		FileOutputStream obj1=new FileOutputStream("C:\\Users\\y.abhishek.kaki\\Desktop\\IO package\\byte1.txt");
		FileOutputStream obj2=new FileOutputStream("C:\\Users\\y.abhishek.kaki\\Desktop\\IO package\\byte2.txt");
		
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		output.write(str1.getBytes());
		output.write(str2.getBytes());
		output.writeTo(obj1);
		output.writeTo(obj2);
		
		
		ByteArrayInputStream input1=new ByteArrayInputStream(str1.getBytes());
		ByteArrayInputStream input2=new ByteArrayInputStream(str2.getBytes());
		int i=0;
		while((i=input1.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		while((i=input2.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

}
