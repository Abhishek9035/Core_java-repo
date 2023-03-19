class Tables
{
	
	synchronized void displayTables(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(n+i);
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
class MyThreadOne extends Thread
{
	Tables m;
	public MyThreadOne(Tables m)
	{
		this.m=m;
	}
	public void run()
	{
		m.displayTables(3);
	}
}
class MyThread2 extends Thread
{
	Tables m;
	public MyThread2(Tables m)
	{
		this.m=m;
	}
	public void run()
	{
		m.displayTables(4);
	}
}
public class synchronizationDemo2 {

	public static void main(String[] args) {
		Tables obj=new Tables();
		MyThreadOne obj1=new MyThreadOne(obj);
		MyThread2 obj2=new MyThread2(obj);
		obj2.start();
		obj1.start();

	}

}
