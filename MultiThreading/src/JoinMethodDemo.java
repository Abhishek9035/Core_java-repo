
public class JoinMethodDemo extends Thread {
	int n=9;
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
			System.out.println(Thread.currentThread().getName()+i);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethodDemo t1=new JoinMethodDemo();
		JoinMethodDemo t2=new JoinMethodDemo();
		JoinMethodDemo t3=new JoinMethodDemo();
		t1.start();
		t1.setName("One");
		try
		{
			t1.join();   // The importance is given to the first object t1 as we had use the join
						//method , so the implementation of t1 will be completed first then remain objects wiil done. 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t2.setName("Two");
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		t3.start();
		t3.setName("Three");
	}

}
