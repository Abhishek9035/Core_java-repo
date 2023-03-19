/*Worker Threads: also known as background thread where all time 
 				* consuming background tasks are executed.*/
public class WorkerThreadDemo implements Runnable {
	 private String name;
	 public WorkerThreadDemo(String name)
	 {
		 this.name=name;
	 }
	
	 private void message()
	 {
		 try
		 {
			 Thread.sleep(500);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+name);
		message();
		//System.out.println(Thread.currentThread().getName()+"(End)");
		
	}

}
