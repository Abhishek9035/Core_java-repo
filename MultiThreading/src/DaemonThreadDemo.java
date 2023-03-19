//Daemon thread is a low priority thread that runs in background to 
//perform tasks such as garbage collection.
// two methods are there in Daemon thread->1.isDaemon(), 2.setDaemon(boolean);
public class DaemonThreadDemo extends Thread {
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("This is a Daemon Thread.");
		}
		else
		{
			System.out.println("This is a user Thread.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadDemo t1=new DaemonThreadDemo();
		DaemonThreadDemo t2=new DaemonThreadDemo();
		DaemonThreadDemo t3=new DaemonThreadDemo();
		t1.setDaemon(true);
		t1.start();
		t2.setDaemon(false);
		t2.start();
		t3.start(); // In this it is directed to user thread.
	}

}
