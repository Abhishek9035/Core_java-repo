import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo{

	public static void main(String[] args) throws IOException{
		FileInputStream input=new FileInputStream("C:\\Users\\y.abhishek.kaki\\Desktop\\IO package\\fileDemo1.txt");
		int i=0;
		while((i=(char)input.read())!=-1)
		{
		
			System.out.print((char)i);
		}
		input.close();
	
	
	}

}
