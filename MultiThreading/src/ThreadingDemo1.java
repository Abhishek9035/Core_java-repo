// Basic Thread concept
//Sleep method concept
//Join method concept
class Thread1 extends Thread
{
	public void run()
	{
		
		for(int i=0;i<8;i++)
		{
			try
			{
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}

public class ThreadingDemo1
{
	public static void main(String args[]) throws Exception
	{
		Thread1 obj1=new Thread1();
		Thread1 obj2=new Thread1();
		
		obj1.setName("One");
		obj1.start();
		obj1.join();
		
		obj2.setName("Two");
		obj2.start();
	}		
}
	
