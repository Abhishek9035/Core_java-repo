
public class SleepMethodDemo extends Thread{
	int n=10;
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(Thread.currentThread().getId()+i);
		}
	}
	public static void main(String[] args) {
		
		SleepMethodDemo ts=new SleepMethodDemo();
		ts.start();
	}
}
