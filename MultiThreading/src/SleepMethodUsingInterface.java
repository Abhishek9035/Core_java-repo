
public class SleepMethodUsingInterface implements Runnable {

	//SleepMethod using Runnable interface works same as class inheritance 
	
	
	@Override
	public void run() {
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
			System.out.println(Thread.currentThread().getId()+i);
		}
		
	}
	

	public static void main(String[] args) {
		
		SleepMethodUsingInterface obj=new SleepMethodUsingInterface();
		Thread ob=new Thread(obj); //This format should be used when we implements interfaces.
		ob.start();
	}
}
