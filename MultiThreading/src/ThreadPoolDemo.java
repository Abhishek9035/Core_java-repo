import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newFixedThreadPool(4);
		for(int i=0;i<4;i++)
		{
			Runnable worker=new WorkerThreadDemo(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
		System.out.println("Finished all threads");
			}

	}


