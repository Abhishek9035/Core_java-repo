
public class PriorityThreadDemo extends Thread {
	
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Running Thread "+Thread.currentThread().getId());
			System.out.println("Priority Thread "+Thread.currentThread().getPriority());
		}	
		
	}

	public static void main(String[] args) {
		PriorityThreadDemo obj1=new PriorityThreadDemo();
		PriorityThreadDemo obj2=new PriorityThreadDemo();
		PriorityThreadDemo obj3=new PriorityThreadDemo();
		obj1.setPriority(MAX_PRIORITY);  //max priority=10
		//obj1.start();
		
		obj2.setPriority(MIN_PRIORITY); //min priority=1
		try
		{
			obj2.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		obj2.start();
		
		obj3.setPriority(NORM_PRIORITY); // normal priority=5
		obj3.start();
	}

}
