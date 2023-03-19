class TableDemo1
{
	synchronized void run(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);	
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
}
class ThreadDemoOne extends Thread
{
	TableDemo1 m;
	public ThreadDemoOne(TableDemo1 m)
	{
		this.m=m;
	}
	public void run()
	{
		m.run(8);
	}	
}
class ThreadDemoTwo extends Thread
{
	TableDemo1 m;
	public ThreadDemoTwo(TableDemo1 m)
	{
		this.m=m;
	}
	public void run()
	{
		m.run(4);
	}
}
public class SynchronizationThreadingDemo {
	public void main(String args[]) throws Exception
	{
	TableDemo1 t=new TableDemo1();
	ThreadDemoOne obj1=new ThreadDemoOne(t);
	ThreadDemoTwo obj2=new ThreadDemoTwo(t);
	
	obj1.start();
	obj1.join();
	
	obj2.start();
	obj2.join();
	}
}
