class MyThreadTwo implements Runnable  // using runnable interface
{

	@Override
	public void run() {
		try
		{
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}	
}
public class MultiThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=0;i<n;i++)
		{
		   MyThreadTwo obj=new MyThreadTwo();
		   Thread ob=new Thread(obj);  //This format should be used when we implements interfaces.
		    ob.start();
		}
	}

}
