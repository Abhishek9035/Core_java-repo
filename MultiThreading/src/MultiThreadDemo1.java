class ThreadOne extends Thread  // inheritance of thread class
{
	public void run()
	{
		try
		{
			
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class MultiThreadDemo1 {

	public static void main(String[] args) {
		
			int n=8;
			for(int i=0;i<n;i++)
			{
				ThreadOne t1=new ThreadOne();
				t1.start();
				//t1.run();
			}
		
	}

}
