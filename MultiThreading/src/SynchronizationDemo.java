//synchronization method that only one thread can access the resource at a given point of time.
 //This synchronization is implemented in Java with a concept called monitors.

class Table
{	
	synchronized void display(int n)
	{
		
		for(int i=1;i<n;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
class MyThread1 extends Thread
{
	Table t;
	public MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.display(5);
	}	
}
public class SynchronizationDemo {
	public static void main(String args[])
	{
	Table obj=new Table();
	MyThread1 obj1=new MyThread1(obj);
	obj1.start();
	}
}
