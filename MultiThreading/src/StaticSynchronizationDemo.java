//This example we used anonymous method class/threads/interfaces

class Table1
{
	synchronized static void display(int n)
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
public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread()
				{
					public void run()
					{
					Table1.display(2);
					};
				};	
				Thread t2=new Thread()
				{
						public void run()
						{
						  Table1.display(10);
						};
				};
				
				t2.start();
				t1.start();
	}

}
