//wait()-It tells the calling thread to give up the withdraw method and go to sleep until 
		//some other thread enters the same monitor and calls notify().
//notify()-It wakes up one single thread that called wait() on the same object.
			//It should be noted that calling notify() does not actually give up a lock on a resource.
//notifyAll()-It wakes up all the threads that called wait() on the same object.

class Customer
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw..");
		if(this.amount<amount)
		{
			System.out.println("less amount waiting for deposit..");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println("Deposited amount "+this.amount);
		notify();
	}
}
public class InterThreadSynchronizationDemo {

	public static void main(String[] args) {
		Customer c=new Customer();
		Thread t1=new Thread()
				{
					public void run()
					{
						c.withdraw(15000);
					}
				};
		Thread t2=new Thread()
				{
					public void run()
					{
						c.deposit(10000);
					}
				};	
				t1.start();
				t2.start();
		
	}

}
